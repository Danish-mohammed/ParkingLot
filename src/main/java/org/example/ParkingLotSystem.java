package org.example;

public class ParkingLotSystem {
    public static void main(String[] args) {
        // Create parking lots
        ParkingLot lot1 = new ParkingLot(2);
        ParkingLot lot2 = new ParkingLot(5);

        // Create listeners
        ParkingLotOwner owner = new ParkingLotOwner();
        ParkingAttendant attendant = new ParkingAttendant(lot1);

        // Add listeners to parking lots
        lot1.addListener(owner);
        lot2.addListener(owner);

        // Create cars with Color enum
        Car car1 = new Car("ABC123", "Toyota", Color.BLUE, false);
        Car car2 = new Car("XYZ456", "Honda", Color.RED, true);
        Car car3 = new Car("DEF789", "Ford", Color.GREEN, false);
        Car car4 = new Car("AEF789", "Hyundai", Color.GREEN, false);

        // Park cars using the parking attendant
        ParkingLotOwner parkingLotOwner = owner;
        parkingLotOwner.instructParkingAttendant(attendant);

        // Unpark cars
        lot1.unParkCar(car1);
        lot2.unParkCar(car2);
        lot1.unParkCar(car3);
    }
}