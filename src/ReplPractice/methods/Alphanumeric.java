package ReplPractice.methods;

import java.util.*;

public class Alphanumeric {
    public static void main(String[] args) {
        String word = "54t43DCghgh79";
        int count = 0;
        int indexDigits = 0;
        int indexLetters = 0;

        String[] splitWord = word.split("");
        char[] chars = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if (indexLetters > indexDigits) {
                Arrays.sort(chars, indexDigits, indexLetters);
            } else {
                Arrays.sort(chars, indexLetters, indexDigits);
            }
            if (Character.isDigit(chars[i])) {
                count++;
                indexDigits = count;
//
            } else {
                count++;
                indexLetters = count;
//            }
            }

        }
        System.out.println(chars);
    }
}
