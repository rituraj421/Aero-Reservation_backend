package com.ritu.springBootRESTfulWebservices.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "destinations")
public class Destination
{
    @Id
    @Column(name = "destination_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer destinationId;
    @Column(name = "date_time")
    @JsonFormat(pattern = "MM-dd-yyyy HH:mm:ss")
    private LocalDateTime arrivalDateTime;
    @OneToOne
    @JoinColumn(name = "airport_id", referencedColumnName = "airport_id")
    private Airport airport;

    public Destination() {}

    public Integer getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Integer destinationId) {
        this.destinationId = destinationId;
    }

    public LocalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Destination)) return false;
        Destination that = (Destination) o;
        return Objects.equals(getDestinationId(), that.getDestinationId()) &&
                Objects.equals(getArrivalDateTime(), that.getArrivalDateTime()) &&
                Objects.equals(getAirport().getAirportId(), that.getAirport().getAirportId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDestinationId(), getArrivalDateTime(), getAirport().getAirportId());
    }

    @Override
    public String toString() {
        return "Destination{" +
                "destinationId=" + destinationId +
                ", arrivalDateTime=" + arrivalDateTime +
                ", airport=" + airport.getAirportId() +
                '}';
    }
}
