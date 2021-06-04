package day38_methods;

public class StringUtil {
    public static void main(String[] args) {

        System.out.println("isNullOrEmpty(\"hello\") = " + isNullOrEmpty("hello"));
        String word = null;
        //System.out.println(word.toUpperCase()); -> nullPointerException
        System.out.println(("isNullOrEmpty(word) = " + isNullOrEmpty(word)));
        word = "";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
    }
    public static boolean isNullOrEmpty(String str) {
        //return (str == null  str.isEmpty());
        if (str == null || str.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
//    public static boolean isPalindrome(String word) {
//
//    }
}