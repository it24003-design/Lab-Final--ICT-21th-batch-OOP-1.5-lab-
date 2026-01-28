class Employee {
    public double calculateSalary() {
        return 0.0;
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary; 
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked; 
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(5000);
        Employee e2 = new PartTimeEmployee(20, 120);

        System.out.println("Full-time salary: " + e1.calculateSalary());
        System.out.println("Part-time salary: " + e2.calculateSalary());
    }
}
