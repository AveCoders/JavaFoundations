package com.avecoder.javafoundations.inheritance;

public class CarFactory {

    public static void main(String[] args) {
        Car car = new Car();
        car.setLicensePlate("123");
        car.updateLicensePlate("abc");
        System.out.println("license plate: " + car.getLicensePlate());
    }
}
