package day27_loops;

public class PrNeigbors {
    public static void main(String[] args) {
        String word = "aabbccffddtt";
        int count = 1;
        for(int i = 0; i< word.length()-1;i++){
          if(word.charAt(i) == word.charAt(i++ )){

              System.out.println("beep " + word.charAt(i));

          }
        }
    }
}
