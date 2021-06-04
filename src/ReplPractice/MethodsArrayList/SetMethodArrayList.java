package ReplPractice.MethodsArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMethodArrayList {
    public static void main(String[] args) {
        ArrayList<String> wordsNew = new ArrayList<>();
        wordsNew.add(0,"Ramil");
        wordsNew.add(1,"Azimov");
        wordsNew.add(2,"SDET");
        wordsNew.add(3,"Amazon");


        test(wordsNew);
    }
    public static void test(ArrayList<String> words){
        System.out.println(words);
    }
}
