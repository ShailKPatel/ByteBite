import java.util.*;

public class Restaurant {
    private InputValidator iv = new InputValidator();

    String restaurantName;
    String restaurantAddress;
    String restaurantTheme;
    int noOfStars;
    int noOfReviews;

    ArrayList<Dish> restaurantMenu = new ArrayList<>();

    Restaurant() {

        this.restaurantName = iv.getStringInput("Enter Restaurant Name : ");
        System.out.println();

        this.restaurantAddress = iv.getStringInput("Enter Restaurant Address : ");
        System.out.println();

        setRestaurantTheme(); // LOC : 40

        setRestaurantRating(); // LOC :

        addToDishArray(); // LOC : 195

    }

    void setRestaurantTheme() {
        System.out.println("Choose a theme to filter restaurants:");
        System.out.println("1. Fast Food");
        System.out.println("2. Dine In");
        System.out.println("3. Food Truck");
        System.out.println("4. Cafe");
        System.out.println("5. Fine Dining");

        int choice = iv.getIntInput("Enter your choice: ");

        switch (choice) {
            case 1:
                this.restaurantTheme = "Fast Food";
                break;
            case 2:
                this.restaurantTheme = "Dine In";
                break;
            case 3:
                this.restaurantTheme = "Food Truck";
                break;
            case 4:
                this.restaurantTheme = "Cafe";
                break;
            case 5:
                this.restaurantTheme = "Fine Dining";
                break;
            default:
                System.out.println("Invalid choice. Setting theme to Fast Food.");
                this.restaurantTheme = "Fast Food";

        }
    }

    void setRestaurantRating() {
        this.noOfStars = iv.getIntInput("Enter Number of Stars : ");
        while (this.noOfStars < 0) {
            System.out.println("Number of Stars cant be less than zero");
            this.noOfStars = iv.getIntInput("Enter Number of Reviews for this Restaurant : ");
        }
        System.out.println();

        this.noOfReviews = iv.getIntInput("Enter Number of Reviews : ");
        while (this.noOfReviews <= 0) {
            System.out.println("Number of Reviews cant be zero");
            this.noOfReviews = iv.getIntInput("Enter Number of Reviews : ");
        }
        System.out.println();
    }

    void addToDishArray() {

        int numDishes = iv.getIntInput("Enter the Number of Dishes : ");

        for (int i = 1; i <= numDishes; i++) {
            System.out.println();
            System.out.println("Enter details for Dish " + (i) + " : ");
            System.out.println("------------------------------");

            restaurantMenu.add(new Dish()); // LOC : 35
        }
        System.out.println();
    }

    void printDishArray() {
        if (restaurantMenu.isEmpty()) {
            System.out.println("This Restraunt isn't serving.");
            System.out.println();
        } else {
            System.out.println("Dishes in the Restaurant : " + this.restaurantName);
            System.out.println();
            for (int i = 0; i < restaurantMenu.size(); i++) {
                System.out.println("Dish " + (i + 1) + " : ");
                System.out.println();
                this.restaurantMenu.get(i).dishPrint(); // Using dishPrint method from Dish class
                System.out.println("------------------------------");
            }
        }
    }

}
