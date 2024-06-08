package com.bytebite.person;

import com.bytebite.util.InputValidator;

public class DeliveryPartner extends Person {

    private static int counter = 0;
    private int deliveryPartnerId;
    private String vehicleType;
    private String vehicleRegistrationNumber;
    private boolean isAvailable;

    public DeliveryPartner(InputValidator iv) {
        super(
                iv.getStringInput32Char("Enter name: "),
                iv.setValidPhoneNumber(),
                iv.setValidEmail(),
                iv.setValidPassword());

        this.deliveryPartnerId = ++counter;
        this.vehicleType = iv.getStringInput32Char("Enter Vehicle Type: ");
        this.vehicleRegistrationNumber = iv.getStringInput32Char("Enter Vehicle Registration Number: ");
    }

    // Getters and Setters
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleRegistrationNumber() {
        return vehicleRegistrationNumber;
    }

    public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "DeliveryPartner{" +
                "name='" + getName() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", vehicleRegistrationNumber='" + vehicleRegistrationNumber + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
