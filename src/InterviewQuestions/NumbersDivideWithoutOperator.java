package InterviewQuestions;

public class NumbersDivideWithoutOperator {
    public static void main(String[] args) {
        devides(5,4);
    }
   public static void devides(int n1, int n2){
       if(n2 == 0){
           System.out.println(" invalid number");
           return;
       }
       int count = 0;
       while (n1 > n2){
           n1 -= n2;
           count++;
       }
       System.out.println(count + " remainder is " + n1);
   }
}
