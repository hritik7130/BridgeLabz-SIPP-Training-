package Constructor.Level1;

public class Circle {
    // Attribute
    private double radius;


    public Circle() {
        this(1.0); 
    }


    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate and return area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }

    // Main method for demonstration
    public static void main(String[] args) {
        // Using default constructor
        Circle circle1 = new Circle();
        System.out.println("Default Circle:");
        circle1.displayDetails();

        System.out.println();

        
        Circle circle2 = new Circle(5.5);
        System.out.println("Custom Circle:");
        circle2.displayDetails();
    }
}
