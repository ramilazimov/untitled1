package day37_methods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading.sum(10,5);
        sum(16.67,67.54);
        sum(1,3,4,5);
        sum("Ramil is"," SDET in a big company");


    }

    public static void sum(int num1, int num2) {
        System.out.println("sum(int num1,int num2)");
        System.out.println("result = " + (num1 + num2));
    }

    public static void sum(int num1, int num2, int num3,int num4) {
        System.out.println("sum(int num1,int num2,int num3,int num4)");
        System.out.println("result = " + (num1 + num2 + num3+ num4));

    }
    public static void sum(double num1, double num2){
        System.out.println("sum(double num1, double num2)");
        System.out.println(num1 + num2);

    }
    public static void sum(String str1,String str2){
        System.out.println("sum(String str1,String str2)");
        System.out.println("result = " + str1 + str2);
    }
}