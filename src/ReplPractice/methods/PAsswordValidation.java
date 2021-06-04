package ReplPractice.methods;

public class PAsswordValidation {
    public static void main(String[] args) {
        String password = "Ramil5+";
        boolean isDigit = false;
        boolean isUpper = false;
        boolean isLower = false;
        boolean isSpecial = false;

        if(password.length()>=6 && !(password.contains(" "))){
            for(int i =0;i < password.length();i++){
                if(password.charAt(i) >=33 && password.charAt(i) <=47){


                } else if(password.charAt(i) >=48 && password.charAt(i) <=57){

                } else if(password.charAt(i) >=65 && password.charAt(i) <=90){

                } else if(password.charAt(i) >=97 && password.charAt(i) <=122){


                }
            }

        } else {

        }
    }
}
