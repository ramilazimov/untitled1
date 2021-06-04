package ReplPractice;

public class WithoutX_x {
    public static void main(String[] args) {
        String word = "xHiX ";
        if(word.charAt(0) == 'x' ||word.charAt(0) == 'X'|| word.charAt(word.length()-1) == 'X' || word.charAt(word.length()-1) == 'X' ){
            System.out.println(word.substring(word.indexOf(0)+1,word.indexOf(word.length()-2)));
        }

    }
}
