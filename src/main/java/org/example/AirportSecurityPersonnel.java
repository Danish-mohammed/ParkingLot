package org.example;

public class AirportSecurityPersonnel implements ParkingLotListener {
    @Override
    public void onParkingLotStatusChanged(ParkingLot parkingLot) {
        if (parkingLot.isFull()) {
            System.out.println("Parking lot is full. Redirecting security staff.");
        } else {
            System.out.println("Parking lot status changed. Checking for space.");
            checkForSpaceAgain(parkingLot);
        }
    }

    @Override
    public void onParkingLotHasSpaceAgain(ParkingLot parkingLot) {
        System.out.println("Parking lot has space again. Adjusting security staff accordingly.");
    }

    private void checkForSpaceAgain(ParkingLot parkingLot) {
        if (parkingLot.hasSpaceAgain()) {
            parkingLot.notifyListeners();
        }
    }
}
