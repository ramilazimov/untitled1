package day19_class_vs_object_strings;

public class LengthOfTheString {
    public static void main(String[] args) {
        String word = "ramil";
        System.out.println(word.length());
        word = "ramzes   765ghg";
        System.out.println(word.length());
        String word1 = "amzazon prime 777";
        System.out.println(word1.length());

        word1 = "Ramil is top  ESDET engineer in big company";
        System.out.println(" count of this word - " + word1.length());
        System.out.println("wooden spoon".length());
        String firstName = "Ramil Azimov is best ESDET";
        System.out.println(firstName.length());

        int count = firstName.length();
        System.out.println("count is - " + count);
     String  password = "abc123";
     if(password.length() >= 6){
         System.out.println("your password is correct - " + password.length());
     } else {
         System.out.println(" wrong count ");
     }


     }
    }

