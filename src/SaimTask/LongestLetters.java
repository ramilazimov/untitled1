package SaimTask;

public class LongestLetters {

     public static void main(String[] args){
       String word = "jaaavvvva";
       char letter = ' ';

       for(int i = 0; i < word.length()-1;i++ ){
           if(word.charAt(i) == word.charAt(i+1))
           letter += word.charAt(i);
         System.out.println(letter);
       }

//         String anotherPalindrome = "Niagara. O roar again!";
//         char aChar = anotherPalindrome.charAt(4);
//         System.out.println(aChar);
     }

}
