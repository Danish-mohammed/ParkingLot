package org.example;

public class ParkingLotOwner implements ParkingLotListener {
    @Override
    public void onParkingLotStatusChanged(ParkingLot parkingLot) {
        if (parkingLot.isFull()) {
            System.out.println("Parking lot is now full. Please put out the full sign.");
        }
    }
}
