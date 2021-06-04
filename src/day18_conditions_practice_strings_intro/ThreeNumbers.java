package day18_conditions_practice_strings_intro;

public class ThreeNumbers {
    public static void main(String[] args) {
        int num1 = 123;
        int num2 = 100;
        int num3 = 2000;
        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " largest number");
        } else if(num2 >= num1 && num2 >= num3){
            System.out.println(num2 + " largest number");
        } else if (num3 > num1 && num3 > num2){
            System.out.println(num3 + " largest number");
        }
    }
}
