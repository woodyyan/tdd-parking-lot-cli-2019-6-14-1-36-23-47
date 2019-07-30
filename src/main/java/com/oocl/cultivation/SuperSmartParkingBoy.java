package com.oocl.cultivation;

import java.util.ArrayList;
import java.util.List;

public class SuperSmartParkingBoy {
    private List<ParkingLot> parkingLots;

    public SuperSmartParkingBoy(List<ParkingLot> parkingLots) {

        this.parkingLots = parkingLots;
    }

    public List<ParkingTicket> park(List<Car> cars) {
        List<ParkingTicket> tickets = new ArrayList<>();
        for (Car car : cars) {
            ParkingTicket ticket = parkingLots.get(0).add(car);
            tickets.add(ticket);
        }
        return tickets;
    }
}
