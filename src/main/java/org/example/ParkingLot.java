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

    public boolean unParkCar(Car car) {
        if (parkedCars.contains(car)) {
            parkedCars.remove(car);
            System.out.println(car.toString() +" unparked successfully.");
            System.out.println("Driver unparked the car to go home.");
            return true;
        } else {
            System.out.println("Car not found in the parking lot.");
            return false;
        }
    }
}
