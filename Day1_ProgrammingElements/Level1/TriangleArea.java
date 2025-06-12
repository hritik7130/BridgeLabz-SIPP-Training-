import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the base of the triangle in cm: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double height = scanner.nextDouble();

        // Area in square centimeters
        double areaCm = 0.5 * base * height;

        double areaIn = areaCm / 6.4516;

        // Output
        System.out.println("The Area of the triangle in sq cm is " + areaCm + 
                           " and in sq in is " + areaIn);

    }
}
