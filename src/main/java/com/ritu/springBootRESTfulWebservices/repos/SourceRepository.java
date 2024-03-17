package com.ritu.springBootRESTfulWebservices.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ritu.springBootRESTfulWebservices.models.Source;

@Repository
public interface SourceRepository extends CrudRepository<Source, Integer> {
}
