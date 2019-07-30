package com.oocl.cultivation;

import java.util.ArrayList;
import java.util.List;

public class SmartParkingBoy extends ParkingBoy {
    private List<ParkingLot> parkingLots;

    public SmartParkingBoy(List<ParkingLot> parkingLots) {
        super(parkingLots);

        this.parkingLots = parkingLots;
    }

    @Override
    public List<ParkingTicket> park(Car... cars) {
        List<ParkingTicket> tickets = new ArrayList<>();
        for (Car car : cars) {
            ParkingTicket ticket = parkingLots.get(0).add(car);
            tickets.add(ticket);
        }
        return tickets;
    }
}
