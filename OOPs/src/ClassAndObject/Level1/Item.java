package ClassAndObject.Level1;


import java.util.Scanner;

class Item1{
    int itemCode;
    String itemName;
    double price;

    // Constructor to initialize item details
    Item1(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: ₹" + price);
    }

    // Method to calculate total cost based on quantity
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class Item {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take item details from user
        System.out.print("Enter Item Code: ");
        int code = scanner.nextInt();
        scanner.nextLine();  // consume newline

        System.out.print("Enter Item Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Item Price: ");
        double price = scanner.nextDouble();

        // Create Item object
        Item1 item = new Item1(code, name, price);

        // Take quantity from user
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        // Display item details and total cost
        System.out.println("\nItem Details:");
        item.displayItemDetails();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: ₹" + item.calculateTotalCost(quantity));

        scanner.close();
    }
}
