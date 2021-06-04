package day24_loops;
import  java.util.*;
public class DoWhile1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPinCode = 1234;
        int pinCode;// decalare here so that visible for while condition
        do{
            System.out.println("enter pin code");
            pinCode = scan.nextInt();
        } while (pinCode != secretPinCode);
        System.out.println("welcome to your account");
    }



}
