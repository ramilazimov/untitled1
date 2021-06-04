package day11_Boolean_operators;

public class practiceForToday {
    public static void main(String[] args) {
        int myNumber = 97;
        int yourNumber = myNumber++;
        System.out.println(myNumber);
        System.out.println(yourNumber);

        int a = 50;
        int b = 22;
        int c = a++ + b++;
        System.out.println(c);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);

        boolean result = 7 > 12;
        System.out.println(result);
        result = 7 < 12;
        System.out.println(result);
    }
}
