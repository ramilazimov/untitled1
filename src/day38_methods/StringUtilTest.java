package day38_methods;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Locale;
import java.util.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        System.out.println(isPalindrome("civic"));
        if(StringUtil.isNullOrEmpty(userName)){
            System.out.println("Fail username cannot be null or empty");
        }
//        System.out.println("civic = " + StringUtilTest.isPalindrome("civic")) ;
//        System.out.println("kayak = " + StringUtilTest.isPalindrome("kayak"));
         String word = "java";
         String revWord = StringUtilTest.reverse(word);
        System.out.println("word - " + word);
        System.out.println("revWord - " + revWord);

    }
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for(int i = 0;i < str.length()/2;i++){
            if(str.charAt(i) != str.charAt(i)-1-i){
                return false;
            }
        }
        return true;
    }
    public static String reverse(String str){
         String reversed = "";
         for(int i = str.length()-1;i>=0 ;i--){
             reversed += str.charAt(i);
         }
         return reversed;

    }
}
