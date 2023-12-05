package org.example;

public class Car {
    private String licensePlate;
    private String make;
    private final Color color;
    private boolean isHandicap;

    public Car(String licensePlate, String make, Color color, boolean isHandicap) {
        this.licensePlate = licensePlate;
        this.make = make;
        this.color = color;
        this.isHandicap = isHandicap;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Color getColor() {
        return color;
    }

    public boolean isHandicap() {
        return isHandicap;
    }

    public void setHandicap(boolean handicap) {
        isHandicap = handicap;
    }
}
