public class CalculateStudentFeeDiscount {
    // Create the main functiion
    public static void main(String[] args) {
        // Initialize the variables
        int fee=125000;
        int discount_percent=10;
        int discount=125000*10/100;
        int remainingFee=fee-discount;

        // Print the remaining fee
        System.out.println("The fee to be paid after discount =" + remainingFee);

        
    }
    
}
