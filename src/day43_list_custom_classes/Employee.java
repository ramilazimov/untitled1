package day43_list_custom_classes;


public class Employee{


         String name;
         String jobTitle;

    public void work(){
            System.out.println(name + " is working as an "+ jobTitle);


    }


    public static void main(String[] args) {
        Employee worker = new Employee();
        worker.name = "Ramil";
        worker.jobTitle = "SDET";
        //worker.work();
        Employee worker1 = new Employee();
        worker1.work();

    }
}
