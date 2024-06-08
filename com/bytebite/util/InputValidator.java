package com.bytebite.util;
// LOC:

// int getIntInput(String prompt) : 14
// String getStringInput(String prompt, int maxLength) : 27
// String setValidPhoneNumber() : 41
// String setValidEmail() : 55
// String getStringInput32Char(String prompt) : 
// String getStringInput64Char(String prompt) : 

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputValidator {

    private static Scanner scanner = new Scanner(System.in);

    public int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String userInput = scanner.nextLine();
                return Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                System.out.println();
            }
        }
    }

    public String getStringInput(String prompt, int maxLength) {
        while (true) {
            System.out.print(prompt);
            String userInput = scanner.nextLine();

            if (userInput.length() <= maxLength) {
                return userInput;
            } else {
                System.out.println("Invalid input. Please enter a string of " + maxLength + " characters or shorter.");
                System.out.println();
            }
        }
    }

    public String setValidPhoneNumber() {
        String regex = "^[789]\\d{9}$"; // Indian phone number regex
        while (true) {
            System.out.print("Enter phone number: ");
            String phone = scanner.nextLine();
            if (Pattern.matches(regex, phone)) {
                return phone;
            } else {
                System.out.println("Invalid phone number. Please enter a valid Indian phone number.");
                System.out.println();
            }
        }
    }

    public String setValidEmail() {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        while (true) {
            System.out.print("Enter email: ");
            String email = scanner.nextLine();
            if (Pattern.matches(regex, email)) {
                return email;
            } else {
                System.out.println("Invalid email. Please enter a valid email address.");
                System.out.println();
            }
        }
    }

    public String setValidPassword() {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$"; // Password must contain at least one digit, one
                                                                   // lowercase, one uppercase letter, and be at least 8
                                                                   // characters long
        while (true) {
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            if (Pattern.matches(regex, password)) {
                return password;
            } else {
                System.out.println(
                        "Invalid password. Password must be at least 8 characters long, contain at least one digit, one lowercase letter, and one uppercase letter.");
                System.out.println();
            }
        }
    }

    public String getStringInput32Char(String prompt) {
        while (true) {
            System.out.print(prompt);
            String userInput = scanner.nextLine();

            if (userInput.length() <= 32) {
                return userInput;
            } else {
                System.out.println("Invalid input. Please enter a string of 32 characters or shorter.");
                System.out.println();
            }
        }
    }

    public String getStringInput64Char(String prompt) {
        while (true) {
            System.out.print(prompt);
            String userInput = scanner.nextLine();

            if (userInput.length() <= 64) {
                return userInput;
            } else {
                System.out.println("Invalid input. Please enter a string of 64 characters or shorter.");
                System.out.println();
            }
        }
    }
}
