package SaimTask.Array2;

import day41_arraylist.ArrayAsList;

import java.util.Arrays;

public class ElgunFizzBuzzCode {
    public static void main(String[] args) {
      int n = 4;

      String[] fizzArray2 = new String[n];
       for(int i =0;i<n;i++){
           fizzArray2[i]=Integer.toString(i);
       }
        System.out.println(Arrays.toString(fizzArray2));



    }

}
