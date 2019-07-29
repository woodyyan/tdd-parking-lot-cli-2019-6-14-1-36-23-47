package com.oocl.cultivation;

public class ParkingBoy {

    private final ParkingLot parkingLot;
    private String lastErrorMessage;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
        lastErrorMessage = null;
        ParkingTicket ticket = parkingLot.add(car);
        if (ticket == null) {
            lastErrorMessage = "The parking lot is full.";
        }
        return ticket;
    }

    public Car fetch(ParkingTicket ticket) {
        if (ticket == null) {
            lastErrorMessage = "Please provide your parking ticket.";
            return null;
        }
        Car car = parkingLot.getCar(ticket);
        if (car == null) {
            lastErrorMessage = "Unrecognized parking ticket.";
        }
        return car;
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
}
