package Arrays;

import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {
        final int EMPLOYEE_COUNT = 10;

        double[] salaries = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonusAmount = new double[EMPLOYEE_COUNT];
        double[] newSalaries = new double[EMPLOYEE_COUNT];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        Scanner scanner = new Scanner(System.in);

    
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            System.out.print("Years of Service: ");
            double years = scanner.nextDouble();

           
            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--; 
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            double bonusRate = yearsOfService[i] > 5 ? 0.05 : 0.02;
            bonusAmount[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonusAmount[i];

            totalBonus += bonusAmount[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        
   
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.printf("Employee  Old Salary , Bonus , New Salary ",
                    (i + 1), salaries[i], bonusAmount[i], newSalaries[i]);
        }

    
        System.out.printf("Total Old Salary: ", totalOldSalary);
        System.out.printf("Total Bonus Paid: ", totalBonus);
        System.out.printf("Total New Salary: ", totalNewSalary);

        
    }
}
