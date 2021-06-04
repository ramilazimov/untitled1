package day14_multi_branch_if_statements;
import java.util.Scanner;

public class practiceCalculatorV1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        char operator = scan.next().charAt(0);
        if(operator == '+'){
            System.out.println(num1 + num2);
        } else if(operator == '-'){
            System.out.println(num1 - num2);
        } else if(operator == '*'){
            System.out.println(num1 * num2);
        } else if (operator == '/'){
            System.out.println(num1 / num2);
        } else {
            System.out.println("invalid operator");
        }
    }
}
