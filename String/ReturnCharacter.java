package String;
import java.util.*;

public class ReturnCharacter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Input 
        String name=  sc.next();
        char[] manual=array(name);
        char[] builtIn=name.toCharArray();
        boolean isSame = compareCharArrays(manual, builtIn);
        System.out.println(isSame);

        displayCharArray(builtIn);

    }
    public static char[] array(String name){
        char[] array=new char[name.length()];
        for(int i=0;i<name.length();i++){
            array[i]=name.charAt(i);


        }
        return array;

    } public static boolean compareCharArrays(char[] manual, char[] buildIn) {
        if (manual.length != buildIn.length) return false;

        for (int i = 0; i < manual.length; i++) {
            if (manual[i] != buildIn[i]) return false;
        }
        return true;
    }
    public static void displayCharArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    
}
