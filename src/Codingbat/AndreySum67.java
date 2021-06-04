package Codingbat;

import java.util.Arrays;

public class AndreySum67 {
    public static void main(String[] args) {
int[] nums ={1,6,2,6,7,1,6,99,99,7};
        System.out.println(Arrays.toString(sum67(nums)));

    }

    public static int[] sum67(int[] nums) {
        boolean inTheZone = false;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 6 && !inTheZone) {
                sum += nums[i];
            } else if (nums[i] == 6) {
                inTheZone = true;
            }
            if (nums[i] == 7) {
                inTheZone = false;
            }
        }
        return new int[]{sum};
    }
}