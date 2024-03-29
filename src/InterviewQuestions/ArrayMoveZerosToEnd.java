package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {3,0,4,0,5,6,0,0,6};
        System.out.println(Arrays.toString(movesZero(arr)));
    }
   public static int[] movesZero(int[] arr){
       ArrayList<Integer> list = new ArrayList<>();
       int countZero = 0;
       for(int each : arr){
           list.add(each);
           countZero += (each ==0)? 1:0;
       }
       list.removeAll(Arrays.asList(0));
       arr = new int[arr.length];
       for(int i =0; i < arr.length-countZero;i++){
           arr[i] = list.get(i);
       }
       return arr;
   }
}
