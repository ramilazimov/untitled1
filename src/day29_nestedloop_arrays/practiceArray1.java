package day29_nestedloop_arrays;

import java.util.*;

public class practiceArray1 {
    public static void main(String[] args) {
        int indexOf1 = 0;
        int indexOf2 = 0;

        int[] arr = {2, 5, 6, 7, 4, 11}; // target integer 11
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == arr[arr.length - 1]) {
                    indexOf1 = i;
                    indexOf2 = j;
                }
                System.out.println(indexOf1 + " " + indexOf2);

            }

        }
    }

}
