package org.example;

public class ParkingLotSystem {
    public static void main(String[] args) {
        ParkingLot lot1 = new ParkingLot(100);
        ParkingLot lot2 = new ParkingLot(100);

        // Create cars with Color enum
        Car car1 = new Car("ABC123", "Toyota", Color.BLUE, false);
        Car car2 = new Car("XYZ456", "Honda", Color.RED, true);

        // Park cars
        lot1.parkCar(car1);
        lot2.parkCar(car2);

        lot1.unParkCar(car1);
        lot2.unParkCar(car2);
    }
}