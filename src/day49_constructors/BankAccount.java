package day49_constructors;

public class BankAccount {
    static double balance = 500.0;//1 copy
    String user;

    public void spend(double amount) {
        System.out.println(user + " is spending $" + amount);
        balance -= amount;
    }

    public void showBalance() {
        System.out.println("Current balance = " + balance);
    }
}
