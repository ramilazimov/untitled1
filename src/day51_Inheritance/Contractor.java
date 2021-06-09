package day51_Inheritance;

public class Contractor extends Employee{
    public double calculateSalary(double hourlyRate) {
        return 50 * 40 * hourlyRate;
    }
}
