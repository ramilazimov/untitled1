package practice;

public class PracticeReturnMethodSintacksis {
    public static void main(String[] args) {
        System.out.println(Plus(2,6));
        System.out.println(minus(7,4));

    }
    public static int Plus(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static int minus(int num3,int num4){
        int result= num3 - num4;
        return result;
    }
}
