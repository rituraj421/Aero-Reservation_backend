package com.ritu.springBootRESTfulWebservices.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ritu.springBootRESTfulWebservices.models.Airplane;

@Repository
public interface AirplaneRepository extends CrudRepository<Airplane, Integer> {
}
