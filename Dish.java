import java.util.*;

public class Dish {

    private InputValidator iv = new InputValidator();

    String dishName;
    String dishCourse;

    // Using ArrayList as it has Fast random access (O(1) - constant time)
    ArrayList<String> dishCuisineTags = new ArrayList<>();
    ArrayList<String> dishDietTags = new ArrayList<>();

    int dishNumberOfStars;
    int dishNumberOfRatings;
    int dishPrice;
    int dishPreparationTime;

    Dish() {
        this.dishName = iv.getStringInput("Enter Dish Name : ");
        System.out.println();

        setDishCourse(); // LOC : 35

        setDishCuisine(); // LOC : 79

        setDishDiet(); // LOC : 138

        setDishPrice(); // LOC : 203

        setDishPreparationTime(); // LOC : 217
    }

    void setDishCourse() {
        int choice = iv.getIntInput(
                "1. Appetizer\n2. Soup\n3. Salad\n4. Entree\n5. Main Course\n6. Side Dish\n7. Dessert\n8. Beverage\n9. Palate Cleanser\n10. Other\n"
                        +
                        "Choose Course : ");

        switch (choice) {
            case 1:
                this.dishCourse = "Appetizer";
                break;
            case 2:
                this.dishCourse = "Soup";
                break;
            case 3:
                this.dishCourse = "Salad";
                break;
            case 4:
                this.dishCourse = "Entree";
                break;
            case 5:
                this.dishCourse = "Main Course";
                break;
            case 6:
                this.dishCourse = "Side Dish";
                break;
            case 7:
                this.dishCourse = "Dessert";
                break;
            case 8:
                this.dishCourse = "Beverage";
                break;
            case 9:
                this.dishCourse = "Palate Cleanser";
                break;
            case 10:
                this.dishCourse = "Other";
                break;
            default:
                System.out.println("Invalid Choice\nSetting Course To Other");
                this.dishCourse = "Other";
        }
        System.out.println();
    }

    void setDishCuisine() {
        int choice;
        int counter = 0;

        System.out.println("You can only add Maximum of 5 Tags.");

        do {
            counter++;
            System.out.println("If you're done adding Tags, press 0.");
            choice = iv.getIntInput(
                    "1. Indian\n2. South Indian\n3. Gujarati\n4. Punjabi\n5. Chinese\n6. Japanese\n7. Italian\n8. Mexican\n9. Continental\n10. Custom\nChoose Cuisine Tags : ");

            switch (choice) {
                case 0:
                    break;
                case 1:
                    this.dishCuisineTags.add("Indian");
                    break;
                case 2:
                    this.dishCuisineTags.add("South Indian");
                    break;
                case 3:
                    this.dishCuisineTags.add("Gujarati");
                    break;
                case 4:
                    this.dishCuisineTags.add("Punjabi");
                    break;
                case 5:
                    this.dishCuisineTags.add("Chinese");
                    break;
                case 6:
                    this.dishCuisineTags.add("Japanese");
                    break;
                case 7:
                    this.dishCuisineTags.add("Italian");
                    break;
                case 8:
                    this.dishCuisineTags.add("Mexican");
                    break;
                case 9:
                    this.dishCuisineTags.add("Continental");
                    break;
                case 10:
                    // For Custom option, prompt the user to input their desired cuisine
                    System.out.print("Enter Custom Cuisine: ");
                    String customCuisine = iv.getStringInput("Enter Custom Cuisine : ");
                    this.dishCuisineTags.add(customCuisine);
                    break;
                default:
                    System.out.println("Invalid Choice\nSetting Cuisine To Custom");
                    // For Custom option, prompt the user to input their desired cuisine
                    String defaultCuisine = iv.getStringInput("Enter Custom Cuisine : ");
                    this.dishCuisineTags.add(defaultCuisine);
            }
        } while ((choice != 0) && (counter < 5));
        System.out.println();
    }

    void setDishDiet() {
        int choice;
        int counter = 0;

        System.out.println("You can only add a Maximum of 3 Diet Tags.");

        do {
            System.out.println("If you're done adding Tags, press 0.");
            choice = iv.getIntInput(
                    "1. Vegetarian\n2. Vegan\n3. Keto\n4. Gluten-Free\n5. Low-Carb\n6. Paleo\n7. Dairy-Free\n8. Nut-Free\n9. Sugar-Free\n10. Custom\nChoose Diet Tags : ");
            switch (choice) {
                case 0:
                    break;
                case 1:
                    this.dishDietTags.add("Vegetarian");
                    counter++;
                    break;
                case 2:
                    this.dishDietTags.add("Vegan");
                    counter++;
                    break;
                case 3:
                    this.dishDietTags.add("Keto");
                    counter++;
                    break;
                case 4:
                    this.dishDietTags.add("Gluten-Free");
                    counter++;
                    break;
                case 5:
                    this.dishDietTags.add("Low-Carb");
                    counter++;
                    break;
                case 6:
                    this.dishDietTags.add("Paleo");
                    counter++;
                    break;
                case 7:
                    this.dishDietTags.add("Dairy-Free");
                    counter++;
                    break;
                case 8:
                    this.dishDietTags.add("Nut-Free");
                    counter++;
                    break;
                case 9:
                    this.dishDietTags.add("Sugar-Free");
                    counter++;
                    break;
                case 10:
                    // For Custom option, prompt the user to input their desired tag

                    String customTag = iv.getStringInput("Enter Custom Diet Tag : ");
                    this.dishDietTags.add(customTag);
                    counter++;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    System.out.println();
            }
        } while ((choice != 0) && (counter < 3));
        System.out.println();
    }

    void setDishPrice() {

        while (true) {
            this.dishPrice = iv.getIntInput("Enter Price : ");
            if ((this.dishPrice >= 50) && (this.dishPrice <= 8000)) {
                break;
            } else {
                System.out.println("Invalid Input. Price Range is fixed betweem Rs 50 and Rs 8000");
            }
            System.out.println();
        }
        System.out.println();
    }

    void setDishPreparationTime() {
        int minDishPreparationTime = 10;
        int maxDishPreparationTime = 120;

        while (true) {
            this.dishPreparationTime = iv.getIntInput("Enter Preparation Time (in minutes) : ");
            if (this.dishPreparationTime >= minDishPreparationTime
                    && this.dishPreparationTime <= maxDishPreparationTime) {
                break;
            } else {
                System.out.println("Invalid Input. Please Enter a Positive Integer between " + minDishPreparationTime
                        + " and " + maxDishPreparationTime + " minutes.");
            }
            System.out.println();
        }
        System.out.println();
    }

    void dishPrint() {
        System.out.println("Dish Name : " + this.dishName);

        System.out.println("Category : " + this.dishCourse);

        System.out.println("Cuisine Tags : ");
        System.out.print(dishCuisineTags);

        System.out.println("Diet Tags : ");
        System.out.println(dishDietTags);

        if (dishNumberOfRatings == 0) {
            System.out.println("This Restaurant is UnRated!");
        } else {
            System.out.println((float) dishNumberOfStars / dishNumberOfRatings);
        }
        System.out.println("Price : " + this.dishPrice);
        System.out.println("Time of Preparation : " + this.dishPreparationTime + " minutes");
        System.out.println();
    }

}
