package ReplPractice.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll {
    public static void main(String[] args) {
        ArrayList<String> wordNewList = new ArrayList<>(Arrays.asList("args","too","yes","great","too"));
        removeAllTarget(wordNewList,"too");

    }

    public static void removeAllTarget(ArrayList<String> wordList,String target){
        for (int i = 0; i < wordList.size(); i++) {
            if(wordList.get(i).equals(target)){
                wordList.remove(i);
            }

        }
        System.out.println(wordList);

    }
}
