package Constructor.Level1;

public class Vechile{
    // Instance Variables
    private String ownerName;
    private String vehicleType;

    // Class Variable
    private static double registrationFee = 500.0;

    // Constructor
    public Vechile(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

   
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee:  " + registrationFee);
    }

   
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to ₹" + registrationFee);
    }

    
    public static void main(String[] args) {
        Vechile vehicle1 = new Vechile("Ravi Kumar", "Car");
        Vechile vehicle2 = new Vechile("Anita Singh", "Bike");

        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
        System.out.println();

        // Update registration fee
        Vechile.updateRegistrationFee(750.0);
        System.out.println();

        
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}
