package com.oocl.cultivation;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private final int capacity;
    private Map<ParkingTicket, Car> cars = new HashMap<>();

    public ParkingLot() {
        this(10);
    }

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public int getAvailableParkingPosition() {
        return capacity - cars.size();
    }

    public ParkingTicket add(Car car) {
        if (capacity == cars.size()) {
            return null;
        }
        ParkingTicket ticket = new ParkingTicket();
        cars.put(ticket, car);
        return ticket;
    }

    public Car getCar(ParkingTicket ticket) {
        if (cars.containsKey(ticket)) {
            Car car = cars.get(ticket);
            cars.remove(ticket);
            return car;
        } else {
            return null;
        }
    }
}
