package String;

import java.util.Scanner;

public class WordLength2DArrayDemo {

   
    public static String[] splitText(String text) {
        String[] words = new String[100]; 
        int wordCount = 0;
        String currentWord = "";

        for (int i = 0; i < getLength(text); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else {
                if (!currentWord.equals("")) {
                    words[wordCount++] = currentWord;
                    currentWord = "";
                }
            }
        }

        if (!currentWord.equals("")) {
            words[wordCount++] = currentWord;
        }

       
        String[] result = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            result[i] = words[i];
        }
        return result;
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

   
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(getLength(words[i]));
        }
        return wordLengthArray;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();


        String[] words = splitText(input);

        String[][] result = getWordsWithLengths(words);

        
        System.out.println("\nWord\tLength");
        System.out.println("---------------");
        for (int i = 0; i < result.length; i++) {
            String word = result[i][0];
            int length = Integer.parseInt(result[i][1]);  
            System.out.println(word + "\t" + length);
        }
    }
}
