package InterviewQuestions;

import sun.security.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortAscendingNeedToComplete {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 5, 77, 8, 6};
        System.out.println(Arrays.toString(sort(nums)));

    }

    public static int[] sort(int[] nums) {
        int max = nums[0];
        int[] sortedArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            max = nums[0];
            for (int j = 0; j < nums.length; j++) {

                if (nums[j] != sortedArr[i]) {
                    if (nums[j] > max) {
                        max = nums[j];
                    }
                }
            }
            sortedArr[i] = max;
        }
        return sortedArr;
    }
}
