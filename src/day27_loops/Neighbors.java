package day27_loops;

import java.time.chrono.MinguoDate;

public class Neighbors {
    public static void main(String[] args) {
        String word = "jaaavvaa spoon";
        int count = 1;
        for (int index = 0; index < word.length() - 1; index++) {
            System.out.print(word.charAt(index));
            System.out.println(word.charAt(index + 1));
            if (word.charAt(index) == word.charAt(index + 1)) ;
            System.out.println("beep - " + word.charAt(index));

        }
    }
}