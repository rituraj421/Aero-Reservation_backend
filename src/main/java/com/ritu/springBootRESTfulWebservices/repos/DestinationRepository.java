package com.ritu.springBootRESTfulWebservices.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ritu.springBootRESTfulWebservices.models.Destination;

@Repository
public interface DestinationRepository extends CrudRepository<Destination, Integer> {
}
