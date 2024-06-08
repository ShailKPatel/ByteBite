package com.bytebite.person;

// LOC:
// Customer() : 
// int getId() : 
// String getName() : 
// String getPhoneNumber() : 
// String getEmail() : 
//  String getAddress() : 

import com.bytebite.util.InputValidator;

public class Customer extends Person {
    private InputValidator iv;

    private static int counter = 0;
    private int customerId;
    private String customerAddress;

    public Customer(InputValidator iv) {
        // here we had to call iv because of issue with static
        super(
            iv.getStringInput32Char("Enter name: "),
            iv.setValidPhoneNumber(),
            iv.setValidEmail(),
            iv.setValidPassword()
        );

        this.iv = iv;
        this.customerId = ++counter;
        this.customerAddress = iv.getStringInput64Char("Enter address: ");
    }

    // Getters and setters for customer
    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + getName() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", address='" + customerAddress + '\'' +
                '}';
    }
}
