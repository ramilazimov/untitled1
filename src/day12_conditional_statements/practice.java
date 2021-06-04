package day12_conditional_statements;
 import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your order total price :");
         double totalPrice = scan.nextDouble();
         if(totalPrice > 120) {
             System.out.println(" 20% discount");
         } else {
             System.out.println(" you get nothing. pay 100% of price");
         }
    }







}




