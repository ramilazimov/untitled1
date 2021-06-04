package day39_Wrapper_Classes;

public class practise {
    public static void main(String[] args) {
        String num = "500",num2="777";
        int sum = 0;
        int digit = Integer.parseInt(num);
        int digit1 = Integer.parseInt(num2);
        sum = digit + digit1;
        System.out.println(sum);

        System.out.println(Character.isLetter('7'));
        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isLowerCase('a'));

        int numInt = 456;
        Integer num3 = numInt;
        int newInt = num3;

    }
}
