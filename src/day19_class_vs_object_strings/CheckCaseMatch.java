package day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "AZ";
        if(countryCode.equals(countryCode.toUpperCase() )){
            System.out.println("Pass case is correct " + countryCode);
        } else {
            System.out.println(" Fail case doesnt match - " + countryCode);
        }

        String word = "UK";
        String uWord = word.toUpperCase();
        System.out.println(word);
        System.out.println(uWord);
        if(word.equals(uWord)){
            System.out.println(" true " + word);
        } else {
            System.out.println(" false " + word);
        }
    }
}
