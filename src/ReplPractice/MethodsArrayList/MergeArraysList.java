package ReplPractice.MethodsArrayList;

import java.util.Arrays;

public class MergeArraysList {
    public static void main(String[] args) {
  int[] nums1 = {1,2,3,4};
  int[] nums2 = {4,5,6,7};
        System.out.println(Arrays.toString(mergeArrays(nums1, nums2)));
    }
   public static int[] mergeArrays(int[] a,int[]b){
        int[] mergeArr = new int[a.length + b.length];
       for (int i = 0; i < mergeArr.length; i++) {
           if(i < a.length){
               mergeArr[i] = a[i];
           } else {
               mergeArr[i] = b[i-a.length];
           }
       }
       return mergeArr;
   }
}
