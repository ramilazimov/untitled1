package SaimTask;
import java.util.*;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your hourly rate");
        double hourlyRate = input.nextDouble();
        System.out.println("enter your weekly hours");
        double weeklyHours =  input.nextDouble();
        double salary;
        System.out.println("enter your number of weeks");
        int numOfWeeks = input.nextInt();
        if(hourlyRate >0){
            System.out.println("your hourly rate is - " + hourlyRate);
            if((weeklyHours >= 1) && weeklyHours <=65){
                System.out.println("your weekly hours is - " + weeklyHours);
                if(numOfWeeks >= 1 && numOfWeeks <=52){
                    System.out.println("your number of weeks - " + numOfWeeks);
                } else {
                    System.out.println(" Number of weeks cannot be less than 1 or greater than 52");
                }
            } else {
                System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
            }

        } else{
            System.out.println(" Hourly Rate cannot be Negative or Zero");
        }

        System.out.println("your salary is -  " + (salary = hourlyRate * weeklyHours * numOfWeeks ));


    }
}
