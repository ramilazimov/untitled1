package day25_loops;

import sun.text.normalizer.UCharacter;

public class LoopLengthCharAt {
    public static void main(String[] args) {
        String word = "Ramil is ESDET whhose is salary 120k";
//        for(int i = 0; i < word.length()-1; i--){
//            System.out.println( i + "-" + word.charAt(i));
//        }
           // reverse it
         for(int i =word.length()-1; i>=0;i-- ){
             System.out.print(word.charAt(i));

         }
    }
}
