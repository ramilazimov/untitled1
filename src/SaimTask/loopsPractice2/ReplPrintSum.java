package SaimTask.loopsPractice2;

import java.util.Arrays;

public class ReplPrintSum {
    public static void main(String[] args) {
        int[] nums = {2,1,2,3,4};
        int sum = 0;
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
        }
        System.out.println(sum);;

    }
}
