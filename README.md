
<ul>
    <li>localhost:8080/h2 -> correspond to in memory h2 database console.</li>
    <li>GET - localhost:8080/ritu/airports -> returns all Airports.</li>
    <li>GET - localhost:8080/ritu/airlines -> returns all Airlines.</li>
    <li>GET - localhost:8080/ritu/airplanes -> returns all Airplanes.</li>
    <li>GET - localhost:8080/ritu/airline/{airlineName}/airplanes -> returns all Airplanes owned by the given Airline.</li>
    <li>GET - localhost:8080/ritu/customers -> returns all Customers.</li>
    <li>GET - localhost:8080/ritu/flights -> returns all Flights.</li>
    <li>GET - localhost:8080/ritu/flights/today -> returns all Flights using Current Systems datetime.</li>
    <li>GET - localhost:8080/ritu/flights/{date} -> returns all Flights by given date.</li>
    <li>GET - localhost:8080/ritu/flights/fare/{fare} -> returns all Flights by given fare.</li>
    <li>GET - localhost:8080/ritu/flights/status/{status} -> returns all Flights by given status.</li>
    <li>GET - localhost:8080/ritu/rsvps/customer/{customerId} -> returns all Reservations by Customer ID.</li>
    <li>GET - localhost:8080/ritu/rsvps/{airline}/active -> returns all ACTIVE Reservations by Airline.</li>
    <li>GET - localhost:8080/ritu/rsvps/{airline}/cancelled -> returns all CANCELLED Reservations by Airline.</li>
    <li>GET - localhost:8080/ritu/rsvps/cancelled -> returns all Reservations that were cancelled.</li>
    <li>POST - localhost:8080/ritu/flight -> insert a Flight into database, does some checking like Loop in Source, Destination - Airports and arrival date must be after the departure date.</li>
    <li>POST - localhost:8080/ritu/rsvp/customer -> makes a reservation for the given customerId with the given flightId.</li>
    <li>PUT - localhost:8080/ritu/rsvp/cancel/{rsvpId} -> cancel a reservation with the given reservation id.</li>
    <li>PUT - localhost:8080/ritu/flight/cancel/{flightId} -> cancel a flight with the given flight id.</li>
    <li>DELETE - localhost:8080/ritu/delete/customer/{customerId} -> delete a customer associated with the given id, free the reservarions that were made by this customer.</li>
</ul>