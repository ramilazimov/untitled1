package day09_scanner_practice;
import java.util.Scanner;
public class MilesToKmConverter {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("########## MILES TO KM CONVERTER ##########");
        System.out.println("Enter miles:");
        double miles = scan.nextDouble();
        double kilometers = miles * 1.609;
        System.out.println(miles + " in kilometres: " + kilometers);


    }
}
