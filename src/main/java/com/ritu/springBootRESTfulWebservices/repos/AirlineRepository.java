package com.ritu.springBootRESTfulWebservices.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ritu.springBootRESTfulWebservices.models.Airline;

@Repository
public interface AirlineRepository extends CrudRepository<Airline, Integer>
{
    Airline findByAirlineNameIgnoreCase(String airlineName);
}
