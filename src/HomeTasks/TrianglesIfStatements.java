package HomeTasks;
import day09_scanner_practice.SalaryCalculator;

import java.util.Scanner;
public class TrianglesIfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter three angles of triangle");
        int ang1 = scan.nextInt();
        int ang2 = scan.nextInt();
        int ang3 = scan.nextInt();
        int sumOfAngles = ang1 + ang2 + ang3;
        if(sumOfAngles == 180){
            System.out.println("valid triangle");
        } else {
            System.out.println("invalid triangle");
        }
    }
}
