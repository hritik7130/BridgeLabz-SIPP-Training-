package String;

import java.util.Scanner;

public class WordAnalyzer {

   
    public static String[] splitText(String text) {
        String[] words = new String[100]; 
        int index = 0;
        String word = "";

        for (int i = 0; i < getStringLength(text); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.equals("")) {
                    words[index++] = word;
                    word = "";
                }
            }
        }


        if (!word.equals("")) {
            words[index++] = word;
        }

     
        String[] finalWords = new String[index];
        for (int i = 0; i < index; i++) {
            finalWords[i] = words[i];
        }

        return finalWords;
    }

    // Method 2: Get length of a string without using length()
    public static int getStringLength(String str) {
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


    public static String[][] getWordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    
    public static String[] findShortestAndLongest(String[][] wordData) {
        int minLen = Integer.MAX_VALUE;
        int maxLen = Integer.MIN_VALUE;
        String shortest = "", longest = "";

        for (int i = 0; i < wordData.length; i++) {
            int len = Integer.parseInt(wordData[i][1]);

            if (len < minLen) {
                minLen = len;
                shortest = wordData[i][0];
            }

            if (len > maxLen) {
                maxLen = len;
                longest = wordData[i][0];
            }
        }

        return new String[]{shortest, longest};
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] wordData = getWordsAndLengths(words);
        String[] result = findShortestAndLongest(wordData);

        System.out.println("\nWords and their lengths:");
        System.out.println("------------------------");
        System.out.println("Word\t\tLength");
        for (String[] row : wordData) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }

        System.out.println("\nShortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
