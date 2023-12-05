package org.example;

public class AirportSecurityPersonnel implements ParkingLotListener {
    @Override
    public void onParkingLotStatusChanged(ParkingLot parkingLot) {
        if (parkingLot.isFull()) {
            System.out.println("Parking lot is full. Redirecting security staff.");
        }
    }
}
