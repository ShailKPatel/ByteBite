
import java.util.ArrayList;
import com.bytebite.util.InputValidator;

public class Restaurant {
    private static int restaurantIdCounter = 0;

    private InputValidator iv = new InputValidator();

    private int restaurantId;
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantTheme;
    private int numberOfStars;
    private int numberOfReviews;

    private ArrayList<Dish> restaurantMenu = new ArrayList<>();

    // Default constructor
    public Restaurant() {
        this.restaurantId = ++restaurantIdCounter;

        this.restaurantName = iv.getStringInput32Char("Enter Restaurant Name : ");

        this.restaurantAddress = iv.getStringInput64Char("Enter Restaurant Address : ");

        setRestaurantTheme();

        setRestaurantRating();

        addToDishArray();
    }

    // Getters
    public int getRestaurantId() {
        return restaurantId;
    }
    
    public String getRestaurantName() {
        return restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public String getRestaurantTheme() {
        return restaurantTheme;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    public ArrayList<Dish> getRestaurantMenu() {
        return restaurantMenu;
    }

    // Setters
    private void setRestaurantTheme() {
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

    private void setRestaurantRating() {
        this.numberOfStars = iv.getIntInput("Enter Number of Stars : ");
        while (this.numberOfStars < 0) {
            System.out.println("Number of Stars can't be less than zero");
            this.numberOfStars = iv.getIntInput("Enter Number of Stars : ");
        }
        System.out.println();

        this.numberOfReviews = iv.getIntInput("Enter Number of Reviews : ");
        while (this.numberOfReviews <= 0) {
            System.out.println("Number of Reviews can't be zero or less");
            this.numberOfReviews = iv.getIntInput("Enter Number of Reviews : ");
        }
        System.out.println();
    }

    private void addToDishArray() {
        int numDishes = iv.getIntInput("Enter the Number of Dishes : ");

        for (int i = 1; i <= numDishes; i++) {
            System.out.println();
            System.out.println("Enter details for Dish " + i + " : ");
            System.out.println("------------------------------");

            restaurantMenu.add(new Dish()); // LOC : 35
        }
        System.out.println();
    }

    public void printDishArray() {
        if (restaurantMenu.isEmpty()) {
            System.out.println("This Restaurant isn't serving.");
            System.out.println();
        } else {
            System.out.println("Dishes in the Restaurant : " + this.restaurantName);
            System.out.println();
            for (int i = 0; i < restaurantMenu.size(); i++) {
                System.out.println("Dish " + (i + 1) + " : ");
                System.out.println();
                this.restaurantMenu.get(i).toString(); // to update
                System.out.println("------------------------------");
            }
        }
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantName='" + restaurantName + '\'' +
                ", restaurantAddress='" + restaurantAddress + '\'' +
                ", restaurantTheme='" + restaurantTheme + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", numberOfReviews=" + numberOfReviews +
                ", restaurantMenu=" + restaurantMenu +
                '}';
    }
}
