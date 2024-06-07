// LOC:
// Customer() : 
// int getId() : 
// String getName() : 
// String getPhoneNumber() : 
// String getEmail() : 
//  String getAddress() : 

public class Customer {
    private static int counter = 0;
    private int customerId;
    private String customerName;
    private String customerPhoneNumber;
    private String customerEmail;
    private String customerAddress;
    private String customerPassword;

    // Default constructor
    public Customer() {
        InputValidator iv = new InputValidator();

        this.customerId = ++counter;
        
        this.customerName = iv.getStringInput32Char("Enter name: ");

        this.customerPhoneNumber = iv.setValidPhoneNumber();

        this.customerEmail = iv.setValidEmail();

        this.customerAddress = iv.getStringInput64Char("Enter address: ");

        this.customerPassword = iv.setValidPassword();
    }

    // Getters
    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    // Method to verify password
    public boolean verifyPassword(String inputPassword) {
        return this.customerPassword.equals(inputPassword);
    }

    // toString method to display customer information
    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }
}
