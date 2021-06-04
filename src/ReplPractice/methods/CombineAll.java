package ReplPractice.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineAll {
    public static void main(String[] args) {
        ArrayList<String> combineNew = new ArrayList<>();
        ArrayList<String> words1 = new ArrayList<>(Arrays.asList("args","some","thing"));
        ArrayList<String> words2 = new ArrayList<>(Arrays.asList("args","yes","I am good at SDET"));
        System.out.println(combineAll(words1, words2));
    }
    public static ArrayList<String> combineAll(ArrayList<String> wordList1,ArrayList<String> wordList2) {
        ArrayList<String> combineList = new ArrayList<>();
        combineList.addAll(wordList1);
        combineList.addAll(wordList2);
        return combineList;


    }
}
