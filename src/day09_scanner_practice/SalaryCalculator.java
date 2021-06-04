package day09_scanner_practice;

public class SalaryCalculator {
    public static void main(String[] args){
        System.out.println("Enter hourly rate:");

        double hourRate = 57.0;
        double weeklyPay = hourRate * 40;
        double monthlyPay = weeklyPay * 52/12;
        double annualPay = monthlyPay * 12;
        System.out.println("Weekly pay:" + weeklyPay);
        System.out.println("Weekly pay:" + monthlyPay);
        System.out.println("Annual pay:" + annualPay);


    }
 }
