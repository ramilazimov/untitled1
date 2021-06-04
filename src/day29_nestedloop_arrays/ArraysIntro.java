package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 10; // single variable
        int [] nums = new int[3];// array variable
        int[] nums2 = new int[5];
        nums2[0] = 34;
        nums2[1] = 23;
        nums[0] = 5;
        nums[1] = 1;
        nums[2] = 2;

        //print value of array
        System.out.println("value at index 0 = " + nums[0]);
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);

        int i = 0;
        System.out.println(nums[i]);//5
        i++;
        System.out.println(nums[i]);
        // how to find size of array
        System.out.println(" number of elelments = " + nums.length);
        // store length of array into len variable
        int len = nums.length;
        System.out.println("len = " + len);
        //change values in array
        nums[0] = 100;
        nums[1] = 300;
        //read of value of index 1 and assign same to index 2
        nums[2] = nums[1];
        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);
        System.out.println("nums[2] = " + nums[2]);

        int[] num2 = {12, 234, 56, 78, 89, 789 };


    }
}
