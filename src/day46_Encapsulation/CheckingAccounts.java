package day46_Encapsulation;

public class CheckingAccounts {
    private String accountHolder;
    private String type;
   private double balance;
    private long accountNumber;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
//    public void setAccountHolder(String accountHolder){
//        this.accountHolder = accountHolder;
//
//    }
//    public String getAccountHolder(){
//        return accountHolder;
//    }
//    public void setType(String type){
//        this.type =type;
//    }
//


    @Override
    public String toString() {
        return "CheckingAccounts{" +
                "accountHolder='" + accountHolder + '\'' +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
