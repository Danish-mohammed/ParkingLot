package org.example;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private int capacity;
    private List<Car> parkedCars;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.parkedCars = new ArrayList<>();
    }

    public boolean isFull() {
        return parkedCars.size() == capacity;
    }

    public void parkCar(Car car) {
        if (!isFull()) {
            parkedCars.add(car);
            System.out.println("Car parked successfully.");
        } else {
            System.out.println("Parking lot is full. Unable to park the car.");
        }
    }
}
