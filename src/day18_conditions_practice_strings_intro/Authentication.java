package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int last4SSN = 1977;
        int pinCode = 5656;
        int expLast4SSN = 1222;
        int expPinCode = 7777;

         if(last4SSN == expLast4SSN && pinCode == expPinCode){
             System.out.println("Authentication successfull");
             if(last4SSN != expLast4SSN && pinCode == expPinCode){
                 System.out.println("ssn is not match ");
             } else if(last4SSN == expLast4SSN && pinCode != expPinCode){
                 System.out.println("pin code is not match");
             }
         } else if(last4SSN != expLast4SSN && pinCode != expPinCode){
             System.out.println("invalid pin code and ssn");
         }
    }
}
