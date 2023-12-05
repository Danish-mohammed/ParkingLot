package org.example;

public class ParkingLotSystem {
    public static void main(String[] args) {
        // Create parking lots
        ParkingLot lot1 = new ParkingLot(2);
        ParkingLot lot2 = new ParkingLot(2);

        // Create listeners
        ParkingLotListener owner = new ParkingLotOwner();
        ParkingLotListener securityPersonnel = new AirportSecurityPersonnel();

        // Add listeners to parking lots
        lot1.addListener(owner);
        lot2.addListener(owner);
        lot1.addListener(securityPersonnel);
        lot2.addListener(securityPersonnel);

        // Create cars with Color enum
        Car car1 = new Car("ABC123", "Toyota", Color.BLUE, false);
        Car car2 = new Car("XYZ456", "Honda", Color.RED, true);
        Car car3 = new Car("DEF789", "Ford", Color.GREEN, false);
        Car car4 = new Car("DEF789", "Ford", Color.GREEN, false);

        // Park cars
        lot1.parkCar(car1);
        lot2.parkCar(car2);
        lot1.parkCar(car3);
        lot1.parkCar(car4);

        // Un-park cars
        lot1.unParkCar(car1);
        lot2.unParkCar(car2);
        lot1.unParkCar(car3);
    }
}