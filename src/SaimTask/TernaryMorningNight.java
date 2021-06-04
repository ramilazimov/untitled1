package SaimTask;
import java.util.Scanner;
public class TernaryMorningNight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter time ");
        double time = input.nextDouble();
        String morningTime;
        String nightTime ;
        morningTime = (time >= 0 && time <= 11)? "morningTime" : "nightTime";
        System.out.println(morningTime);




    }
}
