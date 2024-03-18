import java.util.*;

public class InputValidator {
    // This program will make sure that you don't accidentally crash the program
    // when you enter something other than an int

    private Scanner scanner = new Scanner(System.in);

    int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String userInput = scanner.nextLine();
                int input = Integer.parseInt(userInput);
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please Enter a Valid Integer.");
                System.out.println();
            }
        }
    }

    int getPositiveIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String userInput = scanner.nextLine();
                int input = Integer.parseInt(userInput);

                // Check if input is positive
                if (input > 0) {
                    return input;
                } else {
                    System.out.println("Invalid Input. Please Enter a Positive Integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please Enter a Valid Integer.");
                System.out.println();
            }
        }
    }

    String getStringInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String userInput = scanner.nextLine();

            if (userInput.length() <= 32) {
                return userInput;
            } else {
                System.out.println("Invalid Input. Please Enter a String of 32 Characters or Shorter.");
                System.out.println();
            }
        }
    }

}
