package day38_methods;

import java.util.Arrays;

public class ArrraysUtilsTest {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8,};
        int[] nums2 = {2,3,4,5,6,7,8,9};

        ArraysUtils.printArray(nums);
        ArraysUtils.printArray(new int[]{23,45,56,67,78});
        System.out.println("5 found = " + contains(nums2,5));

        System.out.println("sum - " + ArraysUtils.sum(nums));

    }
    public static boolean contains (int[] nums, int num){
        boolean found = false;
        for(int each:nums){
            if(each == num){
             found = true;
             break;
            }
        }
        return found;
    }
}
