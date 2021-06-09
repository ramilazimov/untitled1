package InterviewQuestions;

public class SumOfDigits {
    public static void main(String[] args) {
        String str = "3fds45vfv 6 7rye78";
        System.out.println("sumOfDigits(str) = " + sumOfDigits(str));

    }
   public static int sumOfDigits(String str){

       int total = 0;
       char[] ch = str.toCharArray();
       for(char each : ch){
           if(Character.isDigit(each)){
               total += Integer.parseInt("" + each);
           }
       }
       return total;

   }
}
