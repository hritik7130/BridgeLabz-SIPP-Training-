package Constructor.Level1;

public class Book {
   
    private String title;
    private String author;
    private double price;

    // Default Constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    
    public void displayBookDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        // Using default constructor
        Book defaultBook = new Book();
        System.out.println("Default Book:");
        defaultBook.displayBookDetails();

        System.out.println();

        // Using parameterized constructor
        Book customBook = new Book("The Alchemist", "Paulo Coelho", 299.99);
        System.out.println("Custom Book:");
        customBook.displayBookDetails();
    }
}
