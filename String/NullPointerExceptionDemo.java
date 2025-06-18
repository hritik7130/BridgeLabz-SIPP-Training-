package String;

public class NullPointerExceptionDemo {

 
    public static void generateException() {
        String text = null;  
        
        int length = text.length(); 
        System.out.println("Length of text: " + length);
    }


    public static void handleException() {
        String text = null;
        try {
            int length = text.length();  
            System.out.println("Length of text: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        
        System.out.println("--- Generating Exception ---");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception in generateException: " + e.getMessage());
        }

        System.out.println("--- Handling Exception ---");
        handleException();
    }
}
