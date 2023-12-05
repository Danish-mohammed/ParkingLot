package org.example;

public interface ParkingLotListener {
    void onParkingLotStatusChanged(ParkingLot parkingLot);
    void onParkingLotHasSpaceAgain(ParkingLot parkingLot);
}
