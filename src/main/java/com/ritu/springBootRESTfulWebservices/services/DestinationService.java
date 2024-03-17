package com.ritu.springBootRESTfulWebservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ritu.springBootRESTfulWebservices.models.Destination;
import com.ritu.springBootRESTfulWebservices.repos.DestinationRepository;
import com.ritu.springBootRESTfulWebservices.utils.Util;

import java.util.Optional;

@Service
public class DestinationService
{
    private final DestinationRepository destinationRepository;

    @Autowired
    public DestinationService(final DestinationRepository destinationRepository)
    {
        this.destinationRepository = destinationRepository;
    }

    public Destination getDestinationById(Integer destinationId) throws IllegalArgumentException
    {
        if(Util.validateNumber(destinationId))
        {
            Optional<Destination> destination = destinationRepository.findById(destinationId);
            return destination.isPresent() ? destination.get() : null;
        }
        return null;
    }

    public Destination addDestination(Destination destination) throws IllegalArgumentException
    {
        if(Util.validateDestination(destination))
        {
            return destinationRepository.save(destination);
        }
        return null;
    }
}
