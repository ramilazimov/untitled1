package day33_arrays;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        String word = "helllo_world";
        String[] strArr = word.split("_");
        System.out.println(Arrays.toString(strArr));
    }
}
