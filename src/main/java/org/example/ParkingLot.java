package org.example;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private int capacity;
    private List<Car> parkedCars;
    private List<ParkingLotListener> listeners;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.parkedCars = new ArrayList<>();
        this.listeners = new ArrayList<>();
    }

    public boolean isFull() {
        return parkedCars.size() == capacity;
    }

    public void parkCar(Car car) {
        if (!isFull()) {
            parkedCars.add(car);
            System.out.println(car.toString() +" parked successfully.");
            notifyListeners();
        } else {
            System.out.println("Parking lot is full. Unable to park the car.");
        }
    }

    public void unParkCar(Car car) {
        if (parkedCars.contains(car)) {
            parkedCars.remove(car);
            System.out.println(car.toString() +" un-parked successfully.");
            notifyListeners();
        } else {
            System.out.println("Car not found in the parking lot.");
        }
    }

    private void checkLotFull() {
        if (isFull()) {
            System.out.println("Parking lot is now full. Please put out the full sign.");
        }
    }

    public void addListener(ParkingLotListener listener) {
        listeners.add(listener);
    }

    private boolean notifyingListeners = false;

    public void notifyListeners() {
        if (!notifyingListeners) {
            notifyingListeners = true;
            for (ParkingLotListener listener : listeners) {
                listener.onParkingLotStatusChanged(this);
            }
            notifyingListeners = false;
        }
    }

    public boolean hasSpaceAgain() {
        return !isFull();
    }
}
