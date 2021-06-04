package InterviewQuestions;

import java.util.Collections;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        System.out.println(sumOfDigits("3456714"));
    }

   public static int sumOfDigits(String s){
        int total = 0;
     char[] ch = s.toCharArray();
       for (char each : ch) {
           if(Character.isDigit(each)){
               total += Integer.parseInt("" + each);
           }
       }
       return total;
   }
}
