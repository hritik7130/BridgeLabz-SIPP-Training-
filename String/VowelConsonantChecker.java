package String;

import java.util.Scanner;

public class VowelConsonantChecker {

    
    public static String checkCharacterType(char ch) {
       
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

     
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

 
    public static String[][] processString(String input) {
        int len = input.length();
        String[][] result = new String[len][2];

        for (int i = 0; i < len; i++) {
            char ch = input.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }

        return result;
    }

    
    public static void displayResult(String[][] arr) {
        System.out.println("Character\tType");
        System.out.println("------------------------");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        
        String[][] result = processString(input);
        displayResult(result);
    }
}
