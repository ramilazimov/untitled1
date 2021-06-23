package InterviewQuestions;

import javax.lang.model.util.ElementScanner6;

public class FINRA {
    public static void main(String[] args) {
        Finra();
    }
   public static  void Finra(){
       String result = "";
       for (int i = 1; i < 15; i++) {
          if(i%5 == 0 && i%3 == 0){
              result += "FINRA ";
          } else if(i%5 == 0){
              result += "FIN ";
          } else if(i%3 == 0){
            result += "RA ";
          } else {
              result +=i+ " ";
          }
           System.out.println(result);
       }
   }
}
