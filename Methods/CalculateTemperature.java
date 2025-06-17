package Methods;
import java.util.*;

public class CalculateTemperature {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the temperature");
        double temperature=sc.nextDouble();
        System.out.println("Enter the windSpeed");
        double windSpeed=sc.nextDouble();
        System.out.println("The Amount of windchill is equal to :" + calculateWindChill(temperature,windSpeed));



    }public static double calculateWindChill(double temperature, double windSpeed){
        double windChill=37.54+0.6215*temperature+(0.4275*temperature-35.75)*windSpeed;

        return windChill;
    }

    
}
