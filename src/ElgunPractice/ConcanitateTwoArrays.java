package ElgunPractice;

import java.util.Arrays;

public class ConcanitateTwoArrays {
    public static void main(String[] args) {
        char arr1[] = {'a','b','c','d'};
        char arr2[] = {'e','f','g','t'};
        int count = 0;
        char arr3[] = new char[arr1.length  + arr2.length];
        System.out.println(arr3);
        for(int i = 0, j = 0;i < arr1.length;i++){
            arr3[i] = arr1[i];
            count = ++j;
        }

       for (int i = 0;i <  arr3.length;i++){

       }
       for(int j = 0,i = count;j < arr2.length;j++,i++){
          arr3[i] = arr2[j];
  }
        System.out.println(arr3);
    }
}
