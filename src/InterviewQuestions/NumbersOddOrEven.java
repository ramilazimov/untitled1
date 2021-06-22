package InterviewQuestions;

public class NumbersOddOrEven {
    public static void main(String[] args) {
        System.out.println(identifyEvenOdd(7));
    }
   public static String identifyEvenOdd(int n){
       return n % 2 == 0 ? "Even" : " Odd";
   }
}
