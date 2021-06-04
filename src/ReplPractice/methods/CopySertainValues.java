package ReplPractice.methods;

import java.util.Arrays;

public class CopySertainValues {
    public static void main(String[] args) {
        int count = 0;
        String[] arr = {"zero", "one", "two", "three", "four","email","elon mask"};
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].contains("e")) {
                count++;
            }
        }
        String[] newArr = new String[count];

        for (int i = 0,j=0; i < arr.length; i++) {

            if (arr[i].contains("e")) {
                newArr[j++] =arr[i];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}