package ReplPractice.MethodsArrayList;

import java.util.Arrays;

public class PopulateMethodAccepts {
    public static void main(String[] args) {
        int[] i = new int[7];
        System.out.println(Arrays.toString(populate(i)));
    }
   public static int[] populate(int[] r){
       for (int i = 0; i < r.length; i++) {
           r[i] = i+1;
       }
       return r;
   }
}
