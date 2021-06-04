package day13_conditional_statements;

public class Practice {
    public static void main(String[] args) {
        int realPin = 777;
        int inputPin = 776;
        if (realPin == inputPin) {
            System.out.println("next option ");
            System.out.println("withdraw, cashing ");
        } else {
            System.out.println("wrong pin code try it again " + inputPin);
        }
    }
}

