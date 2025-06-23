package Methods;
public class UnitConvertor {

    // 1. Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // 2. Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // 3. Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // 4. Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    
    public static void main(String[] args) {
        
        System.out.println("10 km = " + convertKmToMiles(10) + " miles");
        System.out.println("6.2 miles = " + convertMilesToKm(6.2) + " km");
        System.out.println("5 meters = " + convertMetersToFeet(5) + " feet");
        System.out.println("16.4 feet = " + convertFeetToMeters(16.4) + " meters");
    }
}
