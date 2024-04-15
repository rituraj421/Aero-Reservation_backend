# RESTful Web Services Documentation

## Overview
This document provides documentation for the RESTful web services available in the application. Below are the endpoints and their descriptions.

## Access Swagger UI
[Swagger UI](http://localhost:8080/swagger-ui/index.html) can be accessed to interactively explore and test the API endpoints.

## Endpoints
- **H2 Console**: [localhost:8080/h2](http://localhost:8080/h2) - Access the in-memory H2 database console.

### Airports
- **GET** - [localhost:8080/ritu/airports](http://localhost:8080/ritu/airports) - Returns all airports.

### Airlines
- **GET** - [localhost:8080/ritu/airlines](http://localhost:8080/ritu/airlines) - Returns all airlines.

### Airplanes
- **GET** - [localhost:8080/ritu/airplanes](http://localhost:8080/ritu/airplanes) - Returns all airplanes.

### Airline Airplanes
- **GET** - [localhost:8080/ritu/airline/{airlineName}/airplanes](http://localhost:8080/ritu/airline/{airlineName}/airplanes) - Returns all airplanes owned by the given airline.

### Customers
- **GET** - [localhost:8080/ritu/customers](http://localhost:8080/ritu/customers) - Returns all customers.

### Flights
- **GET** - [localhost:8080/ritu/flights](http://localhost:8080/ritu/flights) - Returns all flights.
- **GET** - [localhost:8080/ritu/flights/today](http://localhost:8080/ritu/flights/today) - Returns all flights using the current system's datetime.
- **GET** - [localhost:8080/ritu/flights/{date}](http://localhost:8080/ritu/flights/{date}) - Returns all flights for the given date.
- **GET** - [localhost:8080/ritu/flights/fare/{fare}](http://localhost:8080/ritu/flights/fare/{fare}) - Returns all flights for the given fare.
- **GET** - [localhost:8080/ritu/flights/status/{status}](http://localhost:8080/ritu/flights/status/{status}) - Returns all flights for the given status.

### Reservations
- **GET** - [localhost:8080/ritu/rsvps/customer/{customerId}](http://localhost:8080/ritu/rsvps/customer/{customerId}) - Returns all reservations by customer ID.
- **GET** - [localhost:8080/ritu/rsvps/{airline}/active](http://localhost:8080/ritu/rsvps/{airline}/active) - Returns all active reservations by airline.
- **GET** - [localhost:8080/ritu/rsvps/{airline}/cancelled](http://localhost:8080/ritu/rsvps/{airline}/cancelled) - Returns all cancelled reservations by airline.
- **GET** - [localhost:8080/ritu/rsvps/cancelled](http://localhost:8080/ritu/rsvps/cancelled) - Returns all reservations that were cancelled.

### Flight Operations
- **POST** - [localhost:8080/ritu/flight](http://localhost:8080/ritu/flight) - Insert a flight into the database. Performs checks such as loop in source, destination airports, and ensures arrival date is after departure date.
- **POST** - [localhost:8080/ritu/rsvp/customer](http://localhost:8080/ritu/rsvp/customer) - Make a reservation for the given customer ID with the given flight ID.
- **PUT** - [localhost:8080/ritu/rsvp/cancel/{rsvpId}](http://localhost:8080/ritu/rsvp/cancel/{rsvpId}) - Cancel a reservation with the given reservation ID.
- **PUT** - [localhost:8080/ritu/flight/cancel/{flightId}](http://localhost:8080/ritu/flight/cancel/{flightId}) - Cancel a flight with the given flight ID.
- **DELETE** - [localhost:8080/ritu/delete/customer/{customerId}](http://localhost:8080/ritu/delete/customer/{customerId}) - Delete a customer associated with the given ID, and free the reservations made by this customer.
