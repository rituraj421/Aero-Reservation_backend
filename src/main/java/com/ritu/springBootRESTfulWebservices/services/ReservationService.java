package com.ritu.springBootRESTfulWebservices.services;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ritu.springBootRESTfulWebservices.errorHandling.badReq;
import com.ritu.springBootRESTfulWebservices.models.Customer;
import com.ritu.springBootRESTfulWebservices.models.Flight;
import com.ritu.springBootRESTfulWebservices.models.Reservation;
import com.ritu.springBootRESTfulWebservices.models.Status;
import com.ritu.springBootRESTfulWebservices.repos.ReservationRepository;
import com.ritu.springBootRESTfulWebservices.utils.Util;

@Service
public class ReservationService
{
    private final ReservationRepository reservationRepository;
    private final CustomerService customerService;
    private final FlightService flightService;

    @Autowired
    public ReservationService(final ReservationRepository reservationRepository,
                              final CustomerService customerService, final FlightService flightService)
    {
        this.reservationRepository = reservationRepository;
        this.customerService = customerService;
        this.flightService = flightService;
    }

    public Set<Reservation> getAllRSVPsByCustomerId(Integer customerId) throws IllegalArgumentException
    {
        if(Util.validateNumber(customerId))
        {
            Iterable<Reservation> iterable = reservationRepository.findAllRSVPByCustomerId(customerId);
            return iterableToReservationSet(iterable);
        }
        return null;
    }

    public boolean addRSVPByCustomerId(Map<String, Object> json) throws badReq, NoSuchElementException
{
    int customerId = -1;
    int flightId = -1;

    Object customerIdObj = json.get(Util.CUSTOMER_ID_JKEY);
    Object flightIdObj = json.get(Util.FLIGHT_ID_JKEY);

    if (customerIdObj instanceof Integer && flightIdObj instanceof Integer) {
        customerId = (Integer) customerIdObj;
        flightId = (Integer) flightIdObj;
    } else {
        throw new IllegalArgumentException("Invalid types for customer ID or flight ID");
    }

    Customer customer = customerService.getCustomerById(customerId);
    if(customer == null) throw new NoSuchElementException("Customer does not exist with id=" + customerId);

    Flight flight = flightService.getFlightById(flightId);
    if(flight == null) throw new NoSuchElementException("Flight does not exist with id=" + flightId);

    if(flight.getStatus().equalsIgnoreCase(Status.CANCELLED.toString()))
        throw new badReq();

    if(flight.getCapacity() > flight.getCustomers().size())
    {
        reservationRepository.insertRSVPByCustomerId(Util.toDBDateTime(LocalDateTime.now()), Status.ACTIVE.toString(), customerId, flightId);
        flight.getCustomers().add(customer);
        Flight updated = flightService.updateFlight(flight);
        return updated.getFlightId().equals(flight.getFlightId());
    }
    else throw new badReq(HttpStatus.EXPECTATION_FAILED.value(),"Flight is full. Cannot do rsvp.");
}


    public boolean cancelRSVPByCustomerId(Integer rsvpId) throws IllegalArgumentException
    {
        if(Util.validateNumber(rsvpId))
        {
            Optional<Reservation> optionalReservation = reservationRepository.findById(rsvpId);
            if (!optionalReservation.isPresent())
                throw new IllegalArgumentException("No reservation exists with id=" + rsvpId);

            Reservation reservation = optionalReservation.get();

            reservation.setStatus(Status.CANCELLED);
            reservation.getFlight().getCustomers().remove(reservation.getCustomer());

            reservationRepository.save(reservation);
            return true;
        }
        return false;
    }

    public Set<Reservation> getAllCancelledRSVPs()
    {
        Iterable<Reservation> iterable = reservationRepository.findReservationsByStatus(Status.CANCELLED);
        return iterableToReservationSet(iterable);
    }

    public Set<Reservation> getAllActiveRSVPsByAirline(String airline) throws IllegalArgumentException
    {
        if(Util.validateAirlineName(airline))
        {
            Iterable<Reservation> iterable = reservationRepository.findActiveReservationsByAirline(airline, Status.ACTIVE.toString());
            return iterableToReservationSet(iterable);
        }
        return null;
    }

    public Set<Reservation> getAllCancelledRSVPsByAirline(String airline) throws IllegalArgumentException
    {
        if(Util.validateAirlineName(airline))
        {
            Iterable<Reservation> iterable = reservationRepository.findActiveReservationsByAirline(airline, Status.CANCELLED.toString());
            return iterableToReservationSet(iterable);
        }
        return null;
    }

    // get all rsvps (cancelled and active both)
    public Set<Reservation> getAllRSVPs()
    {
        Iterable<Reservation> iterable = reservationRepository.findAllRSVPs();
        return iterableToReservationSet(iterable);
    }
    
    private Set<Reservation> iterableToReservationSet(Iterable<Reservation> iterable)
    {
        if(iterable != null)
        {
            Set<Reservation> reservations = new LinkedHashSet<>();
            iterable.forEach(reservation -> reservations.add(reservation));
            return reservations;
        }
        return null;
    }
}
