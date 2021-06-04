package day35_methods_with_param;
import java.util.*;
public class MultipleParametrs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 2 doubles");

        showSum(input.nextDouble(),input.nextDouble());

    }
    public static void showSum(double num1,double num2){
        double sum = num1 + num2;
        System.out.println(" The Sum = "+ sum);

    }
}
