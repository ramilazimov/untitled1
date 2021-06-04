package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee worker1 = new Employee();
        worker1.name = "Ramil";
        worker1.jobTitle = "SDET";
        worker1.work();

        Employee emp = new Employee();
        emp.name = "Ramil Azimov";
        emp.jobTitle = "SDET";
        emp.work();
    }
}
