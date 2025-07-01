package Constructor.Level1;

public class Person {
   
    private String name;
    private int age;

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
      
        Person person1 = new Person("Amit", 25);
        System.out.println("Original Person:");
        person1.displayDetails();

        System.out.println();

      
        Person person2 = new Person(person1);
        System.out.println("Cloned Person:");
        person2.displayDetails();
    }
}
