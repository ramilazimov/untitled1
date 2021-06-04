package OfficceHours.Practice_05_12_2021;

public class Bank {
    public static void main(String[] args) {
        BAnkAccount bankAccountOne = new BAnkAccount();
        bankAccountOne.accountHolderName = "Jame Bond";
        bankAccountOne.pin = 1234;
        bankAccountOne.balance = 1_000_000;
        bankAccountOne.accountNumber = 21332131;
        System.out.println(bankAccountOne.pin);
        System.out.println(bankAccountOne.getBalance(1234));
        System.out.println(new BAnkAccount().accountHolderName);

        bankAccountOne = new BAnkAccount();
        System.out.println(bankAccountOne.accountHolderName);

    }
}
