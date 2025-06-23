package String;
import java.util.Scanner;

public class CustomTrim {

    //  Find start and end index without leading/trailing spaces
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find first non-space character from start
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        // Find first non-space character from end
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[] { start, end };
    }

    //  Custom substring using charAt()
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with leading and trailing spaces:");
        String input = sc.nextLine();

      
        int[] indices = findTrimIndices(input);
        int start = indices[0];
        int end = indices[1];

        String customTrimmed = (start <= end) ? customSubstring(input, start, end) : "";

        
        String builtInTrimmed = input.trim();

       
        boolean isSame = compareStrings(customTrimmed, builtInTrimmed);

        //  Display results
        System.out.println("Custom Trimmed String: '" + customTrimmed + "'");
        System.out.println("Built-in Trimmed String: '" + builtInTrimmed + "'");
        System.out.println("Do both strings match? " + isSame);
    }
}
