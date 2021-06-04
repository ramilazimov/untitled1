package day31_arrays;
import java.text.Collator;
import java.util.*;
public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {5,1,4,8,6,9,-5,77};
        // print all nums in same line

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


        System.out.println(Arrays.toString(nums));
        System.out.println("nums[0] " + nums[0]);// min value
        System.out.println("max value " + nums[nums.length-1]);// max value

        String[] words = {"java" , "python" , "C#" , "Kotlin" , "Ruby" , "acossembly"};
      //  System.out.println(Arrays.toString(words));
      Arrays.sort(words);
        System.out.println(String.join("  R  ", words));
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        Arrays.sort(words, Collections.reverseOrder());

//
        System.out.println(Arrays.toString(words));
//
        int[] num = {33,55,123,400};
        Arrays.binarySearch(num, 55);
        Arrays.binarySearch(num,400);
        Arrays.binarySearch(num,400);
        System.out.println(Arrays.binarySearch(num,400));


    }
}
