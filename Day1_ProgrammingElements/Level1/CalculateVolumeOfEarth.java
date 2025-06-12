public class CalculateVolumeOfEarth {
    public static void main(String[] args) {
        int radiusInKm=6378;
        double radiusInmiles=3963.1;
    
        double volumeInKms =(4/3)*3.14*radiusInKm*radiusInKm*radiusInKm;
        double volumeInMiles=(4/3)*3.14*radiusInmiles*radiusInmiles*radiusInmiles;
         
        System.out.println("The Volume of earth in kms is" + volumeInKms + "and the volume of earth in miles is" + volumeInMiles);
     
    }
  

    
}
