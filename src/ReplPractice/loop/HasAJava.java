package ReplPractice.loop;

import java.sql.SQLOutput;

public class HasAJava {
    public static void main(String[] args) {
        String word = "xjavaxx";
        System.out.println(word.indexOf("java")==0 || word.indexOf("java")==1 );
        System.out.println(word.startsWith("java") || word.substring(1).startsWith("java"));

    }
}
