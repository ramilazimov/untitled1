package day18_conditions_practice_strings_intro;
 import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int num = input.nextInt();
        if(num % 2 != 0){
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }



    }
}
