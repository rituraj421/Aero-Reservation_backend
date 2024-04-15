package com.ritu.springBootRESTfulWebservices.models;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "airports")
public class Airport
{
    @Id
    @Column(name = "airport_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer airportId;
    @Column(name = "airport_name")
    private String airportName;

    public Integer getAirportId() {
        return airportId;
    }

    public void setAirportId(Integer airportId) {
        this.airportId = airportId;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;
        Airport airport = (Airport) o;
        return Objects.equals(getAirportId(), airport.getAirportId()) &&
                Objects.equals(getAirportName(), airport.getAirportName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAirportId(), getAirportName());
    }
}
