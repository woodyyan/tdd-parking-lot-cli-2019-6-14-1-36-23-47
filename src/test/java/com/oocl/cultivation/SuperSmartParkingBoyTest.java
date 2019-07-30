package com.oocl.cultivation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SuperSmartParkingBoyTest {
    @Test
    void should_get_two_tickets_when_park_two_cars() {
        List<ParkingLot> parkingLots = new ArrayList<>();
        parkingLots.add(new ParkingLot());
        SuperSmartParkingBoy parkingBoy = new SuperSmartParkingBoy(parkingLots);
        List<Car> cars = new ArrayList<>();
        cars.add(new Car());
        cars.add(new Car());
        List<ParkingTicket> tickets = parkingBoy.park(cars);

        Assertions.assertEquals(2, tickets.size());
    }
}