package ReplPractice.Array;

import java.util.Arrays;
import java.util.Scanner;

//import java.util.*;
public class MakeLast {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int size = input.nextInt();
        int[] nums = new int[size];
        for (int i =0;i < size;i++){
            System.out.println("enter arrays numbers according to size");
            nums[i] = input.nextInt();


        }
        int[] num = new int[size*2];
        num[num.length-1] = nums[nums.length-1];
        System.out.println(Arrays.toString(num));




        }

    }

