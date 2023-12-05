package org.example;

class ParkingLotOwner implements ParkingLotListener {
    private boolean isCheckingForSpaceAgain = false;

    @Override
    public void onParkingLotStatusChanged(ParkingLot parkingLot) {
        if (parkingLot.isFull()) {
            System.out.println("Parking lot is now full. Please put out the full sign.");
        } else {
            System.out.println("Parking lot status changed. Checking for space.");
            checkForSpaceAgain(parkingLot);
        }
    }

    @Override
    public void onParkingLotHasSpaceAgain(ParkingLot parkingLot) {
        System.out.println("Parking lot has space again. Removing the full sign.");
        isCheckingForSpaceAgain = false; // Reset the flag when space is available again
    }

    private void checkForSpaceAgain(ParkingLot parkingLot) {
        if (!isCheckingForSpaceAgain && parkingLot.hasSpaceAgain()) {
            isCheckingForSpaceAgain = true;
            parkingLot.notifyListeners();
        }
    }
}

