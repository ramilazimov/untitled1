package day32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String word = "Java is fun";
        String reverse = " ";
   String[] splitWord = word.split(" ");
   for (int i = splitWord.length-1;i>=0;i--){
       reverse +=splitWord[i] + " ";
       System.out.print(splitWord[i] + " ");

   }
        System.out.println(reverse);
    }
}
