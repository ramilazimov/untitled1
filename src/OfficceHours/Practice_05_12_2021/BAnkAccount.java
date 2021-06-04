package OfficceHours.Practice_05_12_2021;

public class BAnkAccount {
    String accountHolderName;
    int pin;
    double balance;
    long accountNumber;
    public  double getBalance(int inputPin){
        if(pin == inputPin){
            return balance;
        }
        return -1;

    }
}
