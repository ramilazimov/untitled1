package day51_Inheritance;

public class Contractor extends Employee {
    @Override
    public double calculateSalary(double hourlyRate) {
        return 50 * 47 * 1.3;
    }
}