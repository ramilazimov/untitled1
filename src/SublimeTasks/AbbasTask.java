package SublimeTasks;

import java.util.Arrays;

public class AbbasTask {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(letter("selenium")));

    }

    public static String[] letter(String word) {
        String[] str = word.split("");

        for (int i = str.length - 3; i <= str.length - 1; i++) {
            System.out.print((str[i]));
        }
        return str;
    }
}





