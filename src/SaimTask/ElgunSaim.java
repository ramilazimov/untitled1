package SaimTask;
import java.util.*;
public class ElgunSaim {
    public static void main(String[] args) {
        String word = "aabbbccccd";
        String longestSub = "";
        int count = 1;
        int MaxValueSub = 0;

        for (int i = 0; i < word.length() - 1; i++) {

            if (word.charAt(i) == word.charAt(i + 1)) {
                count++;
                longestSub += count;
                System.out.println( longestSub );
            }
        }


    }

}