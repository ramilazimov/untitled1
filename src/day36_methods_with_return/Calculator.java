package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(22.34,12.45));
        System.out.println(add(12.34,56.23));
        double sum = add(23.45,45.56);
        System.out.println(sum);
        System.out.println(minus(23,5));


    }
    public static double add(double num1, double num2){
        double sum = num1 + num2;
        return sum;

    }
    public static double minus (double num1, double num2){
        double result = num1 - num2;
        return result;
    }

}
