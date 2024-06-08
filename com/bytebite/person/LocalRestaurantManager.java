package com.bytebite.person;

import com.bytebite.util.InputValidator;

public class LocalRestaurantManager extends Person {

    private static int counter = 0;
    private int localManagerId;
    private int restaurantId;
    

    public LocalRestaurantManager(InputValidator iv) {
        super(
                iv.getStringInput32Char("Enter name: "),
                iv.setValidPhoneNumber(),
                iv.setValidEmail(),
                iv.setValidPassword());

        this.localManagerId = ++counter;
        this.restaurantId = iv.getIntInput("Enter restaurant id you manage: ");
    }

    // Getters and Setters for LocalRestaurantManager
    public int getManagerId() {
        return localManagerId;
    }

    public int getManagerRestaurantId(){
        return restaurantId;
    }

    @Override
    public String toString() {
        return "LocalRestaurantManager{" +
                "localManagerId=" + localManagerId +
                ", restaurantId=" + restaurantId +
                ", name='" + getName() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}
