package day09_scanner_practice;
import java.util.Scanner;
public class tempConverter {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println(" ### F to C Converter ###");
        System.out.println("Enter Fahrenheiht value: ");

        double fahrenheitValue = input.nextDouble();
        double celsiusValue =(fahrenheitValue - 32) * 5/9;
        System.out.println( fahrenheitValue+ " F is C'" + celsiusValue);

    }

}

