// LOC:
// int getIntInput(String prompt) : 14
// String getStringInput(String prompt, int maxLength) : 27
// String getValidPhoneNumber() : 41
// String getValidEmail() : 55

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

    public String getValidPhoneNumber() {
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

    public String getValidEmail() {
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
}
