package day17_ternary_nested_conditions;

import java.util.Arrays;

public class ArrayConcat2arrays {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4};
        int[] arr2 = {5,6,7,8,9,10};
        System.out.println(Arrays.toString(concat2Arrays(arr1, arr2)));
    }
    public static int[] concat2Arrays(int[] arr1,int[] arr2){
        int[] result =  new int[arr1.length + arr2.length];
      int i =0;
        for(int each : arr1){
          result[i] = each;
         i++;
        }
        for(int each : arr2){
            result[i] = each;
            i++;
        }
        return result;
    }
}
