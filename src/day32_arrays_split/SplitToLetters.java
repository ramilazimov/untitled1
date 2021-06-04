package day32_arrays_split;

public class SplitToLetters {
    public static void main(String[] args) {
       String word = "java";
       String [] splitWord = word.split("");
        char[] letters = word.toCharArray();
        System.out.println(letters[0]);
//        for(String each:splitWord){
//            System.out.print(each);
//        }
//        System.out.print(letters);
    }
}
