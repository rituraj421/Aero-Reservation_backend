package com.ritu.springBootRESTfulWebservices.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ritu.springBootRESTfulWebservices.models.Airport;

@Repository
public interface AirportRepository extends CrudRepository<Airport, Integer>
{
    Airport findByAirportNameIgnoreCase(String airportName);
}
