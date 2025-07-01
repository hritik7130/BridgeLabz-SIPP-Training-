package Constructor.Level1;

public class CarRental {
    // Attributes
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Default Constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    // Constructor - Parameterized
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    
    private double getDailyRate() {
        switch (carModel.toLowerCase()) {
            case "suv": return 1000.0;
            case "sedan": return 800.0;
            case "hatchback": return 600.0;
            default: return 500.0;
        }
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return getDailyRate() * rentalDays;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : ₹" + calculateTotalCost());
    }

    // Main method for demonstration
    public static void main(String[] args) {
        // Default rental
        CarRental rental1 = new CarRental();
        System.out.println("Default Rental:");
        rental1.displayRentalDetails();

        System.out.println();

        // Custom rental
        CarRental rental2 = new CarRental("Rahul Mehra", "SUV", 5);
        System.out.println("Custom Rental:");
        rental2.displayRentalDetails();
    }
}
