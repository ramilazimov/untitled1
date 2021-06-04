package InterviewQuestions;
/*
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
 */

public class PasswordValidationTask {
    public static void main(String[] args) {
        System.out.println(PassWordValidation("Hermes77@"));
    }
    public static boolean PassWordValidation(String password){
        String lowercase="(.*[a-z].*)";
        String uppercase="(.*[A-Z].*)";
        String numbers="(.*[0-9].*)";
        String specialchars="(.*[ -/, :-@].*)";
        boolean HasLower = password.matches(lowercase);
        boolean hasUpper = password.matches(uppercase);
        boolean HasDigits = password.matches(numbers);
        boolean HasChars = password.matches(specialchars);
         boolean Valid = false;
         if(password.length()>=6 && !password.contains(" ")){
             if(HasChars && HasLower && HasDigits && hasUpper ){
                 Valid =true;
             }


         }
        return Valid;

    }

}
