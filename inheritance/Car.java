package com.avecoder.javafoundations.inheritance;

public class Car extends Vehicle{
    int numberOfSeats = 0;

    protected String licensePlate = null;

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }
    @Override
    public void setLicensePlate(String license) {
        super.setLicensePlate(license);
    }
    @Override
    public String getLicensePlate() {
        return super.getLicensePlate();
    }
    public void updateLicensePlate(String license) {
        this.licensePlate = license;
    }
}
