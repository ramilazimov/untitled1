package ReplPractice;

public class HasAJava {
    public static void main(String[] args) {
        String word = "c#javaruby";

        if(word.contains("java") && word.indexOf("java")==0 || word.indexOf("java")==1){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
