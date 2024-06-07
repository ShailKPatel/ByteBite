// LOC:
// Customer() : 
// int getId() : 
// String getName() : 
// String getPhoneNumber() : 
// String getEmail() : 
//  String getAddress() : 


public class Customer {
    private static int counter = 0;
    private int id;
    private String name;
    private String phoneNumber;
    private String email;
    private String address;

    private String password;

    // Default constructor
    public Customer() {
        InputValidator iv = new InputValidator();

        this.id = ++counter;
        
        this.name = iv.getStringInput32Char("Enter name: ");

        this.phoneNumber = iv.setValidPhoneNumber();

        this.email = iv.setValidEmail();

        this.address = iv.getStringInput64Char("Enter address: ");

        this.password = iv.setValidPassword();
    }


    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}


