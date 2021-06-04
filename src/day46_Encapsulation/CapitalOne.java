package day46_Encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccounts acc = new CheckingAccounts();
        acc.setAccountNumber(434378548578L);
        acc.setBalance(100_000_000);
        acc.setAccountHolder("Ramil Azimov");
        acc.setType("360 checking");
        System.out.println(acc);
    }
}
