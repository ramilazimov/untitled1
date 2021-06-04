package SaimTask.loops3;

public class ReverseOnlySecondWord {
    public static void main(String[] args) {
        String word = "I love java";
        String secondWord;
        String reverseWord = "";
        secondWord = word.substring(word.indexOf("l")-1,word.indexOf("e")+1);
        for (int i = secondWord.length();i > 0;--i){
            reverseWord += secondWord.charAt(i-1);

        }
        System.out.println("I " + reverseWord + "java");
    }
}
