package OfficceHours_03_24_2021;

public class AccountNumber {
    public static void main(String[] args) {
        String accountNumber = "50000000";
        if(accountNumber.startsWith("2")) {// if(accountNumber.charAt(0) == '2')
            if(accountNumber.length() == 7){
                System.out.println("valid 2 digit account number");
            } else {
                System.out.println("not  a valid 7 digit account number ");
            }

        } else if(accountNumber.startsWith("5")){

        } else{

        }

    }


}
// look the code on saim only