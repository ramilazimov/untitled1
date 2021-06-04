package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0;
        double salesAmount = 1000.55;
        if (salesAmount <= 2000.35) {
            bonus = 50;
            System.out.println("Good job, you qualified for bonus " + bonus);
        } else {
            bonus = 100;
            System.out.println("Good job, you qualified for full bonus $" + bonus);
        }

    }
}
