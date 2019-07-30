package com.oocl.cultivation;

import java.util.ArrayList;
import java.util.List;

public class ParkingBoy {

    private final List<ParkingLot> parkingLots;
    private String lastErrorMessage;

    public ParkingBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public List<ParkingTicket> park(Car... cars) {
        lastErrorMessage = null;
        List<ParkingTicket> tickets = new ArrayList<>();
        for (Car car : cars) {
            ParkingTicket ticket = parkingLots.get(0).add(car);
            if (ticket == null) {
                lastErrorMessage = "The parking lot is full.";
            } else {
                tickets.add(ticket);
            }
        }
        return tickets;
    }

    public Car fetch(ParkingTicket ticket) {
        if (ticket == null) {
            lastErrorMessage = "Please provide your parking ticket.";
            return null;
        }
        Car car = parkingLots.get(0).getCar(ticket);
        if (car == null) {
            lastErrorMessage = "Unrecognized parking ticket.";
        }
        return car;
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
}
