package day45_OOP;

public class CompareStrings {
    public static void main(String[] args) {
        String word1 = "java";// its in string pool
        String word2 = "java";//re-use from string pool
        String word3 = new String("java");//create in HEAP,outside String pool
        String word4 = new String("java");//create in HEAP,outside String pool
        System.out.println(word1 == word2);//true
        System.out.println(word1 == word3);//false;
        System.out.println(word3 == word4);//false;

        
    }
}
