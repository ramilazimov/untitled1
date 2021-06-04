package day18_conditions_practice_strings_intro;

public class ssnPincode {
    public static void main(String[] args) {
        int last4SSN = 1977;
        int pinCode = 5656;
        int expLast4SSN = 1977;
        int expPinCode = 7777;

        if (last4SSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("Authentication successfull");
        } else {
            System.out.println("Authentication unsuccessfull");
            if (last4SSN != expLast4SSN) {
                System.out.println("ssn is not match ");
            }

            if ( pinCode != expPinCode) {
                System.out.println("pin code is not match");
            }
        }
    }// we use only if to check up all statements
}