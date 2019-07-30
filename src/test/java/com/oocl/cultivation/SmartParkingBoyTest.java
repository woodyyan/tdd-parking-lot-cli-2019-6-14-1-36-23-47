package com.oocl.cultivation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SmartParkingBoyTest {
    @Test
    void should_get_two_tickets_when_park_two_cars() {
        List<ParkingLot> parkingLots = new ArrayList<>();
        parkingLots.add(new ParkingLot());
        SmartParkingBoy parkingBoy = new SmartParkingBoy(parkingLots);
        List<Car> cars = new ArrayList<>();
        cars.add(new Car());
        cars.add(new Car());
        List<ParkingTicket> tickets = parkingBoy.park(cars);

        Assertions.assertEquals(2, tickets.size());
    }
}