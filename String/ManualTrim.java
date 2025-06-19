package String;

import java.util.Scanner;

public class ManualTrim {

    
    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = 0;
        int len = getLength(text);

        
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ') {
                start = i;
                break;
            }
        }

        for (int i = len - 1; i >= 0; i--) {
            if (text.charAt(i) != ' ') {
                end = i;
                break;
            }
        }

        return new int[]{start, end};
    }

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
   
        }
        return count;
    }

    
    public static String manualSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method 4: Compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        int len1 = getLength(s1);
        int len2 = getLength(s2);

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String input = sc.nextLine();

   
        int[] indices = findTrimIndices(input);
        int start = indices[0];
        int end = indices[1];

        
        String trimmedManual = manualSubstring(input, start, end);

        String trimmedBuiltIn = input.trim();

      
        boolean areEqual = compareStrings(trimmedManual, trimmedBuiltIn);

        // Display results
        System.out.println(  input );
        System.out.println(  trimmedManual );
        System.out.println(  trimmedBuiltIn );
        System.out.println(areEqual);
    }
}

