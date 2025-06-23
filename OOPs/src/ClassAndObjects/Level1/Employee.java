package ClassAndObjects.Level1;

class Employee {
    int id;
    double salary;
    String name;

    // Constructor
    public Employee(int id, double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    // Method to display employee details
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1, 50000, "Hritik");
        Employee emp1 = new Employee(2, 40000, "Nitin");
        Employee emp2 = new Employee(3, 50000, "Manu");

        emp.displayInfo();
        emp1.displayInfo();
        emp2.displayInfo();
    }
}


//by hritik