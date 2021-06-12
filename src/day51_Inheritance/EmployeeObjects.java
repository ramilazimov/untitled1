package day51_Inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developer = new Employee();
        System.out.println("developer.calculateSalary(55.0) = " + developer.calculateSalary(55.0));
        double annualDevSalary = developer.calculateSalary(55.0);
        System.out.println("annualDevSalary = " + Math.round(annualDevSalary) );
        Employee tester = new Employee();
        System.out.println("tester.calculateSalary(57.00) = " + tester.calculateSalary(57.00));

    }
}
