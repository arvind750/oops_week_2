class MobilePhone {
    // Attributes
    private String brand;
    private String model;
    private double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    // Main method
    public static void main(String[] args) {
        // Creating MobilePhone objects
        MobilePhone phone1 = new MobilePhone("Oneplus", "One plus 10T", 50000);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 15 Pro", 12700.99);

        // Displaying the details
        phone1.displayDetails();
        System.out.println(); // Adding a space
        phone2.displayDetails();
    }
}
