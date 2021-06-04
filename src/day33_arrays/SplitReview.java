package day33_arrays;
import java.util.*;
public class SplitReview {
    public static void main(String[] args) {
        String word = "java";
        String[] wordSplit = word.split("a");
//        System.out.println(Arrays.toString(wordSplit));
//        System.out.println(wordSplit.length);
//        System.out.println(" split with empty string");
//        String[] splitWord = word.split("");
//        System.out.print(Arrays.toString(splitWord));
        String word1 = "jkj6kj67jkj868j86jlk";
        String[] strArr = word1.split("\\d");
        System.out.println(Arrays.toString(strArr));

        // to split by any number we use \\d
    }
}
