package org.example;

public class ParkingAttendant {
    private ParkingLot parkingLot;

    public ParkingAttendant(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void parkCars() {
        parkingLot.parkCar(new Car("ABC123", "Toyota", Color.BLUE, false));
        parkingLot.parkCar(new Car("XYZ456", "Honda", Color.RED, true));
        parkingLot.parkCar(new Car("DEF789", "Ford", Color.GREEN, false));
        parkingLot.parkCar(new Car("DEF789", "Ford", Color.GREEN, false));
    }
}
