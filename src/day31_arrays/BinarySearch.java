package day31_arrays;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-5, 23, 123, 654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums,654));
//        System.out.println(Arrays.binarySearch(nums,123));
//        System.out.println(Arrays.binarySearch(nums,23));
//        System.out.println(Arrays.binarySearch(nums,2344));
//        System.out.println(Arrays.binarySearch(nums,25));
//        System.out.println(Arrays.binarySearch(nums,700));
//        System.out.println(Arrays.binarySearch(nums,-5));
        //for(int i = 0;i<nums.length;i++){
            if(Arrays.binarySearch(nums,-5)>0){
                System.out.println("present");
            } else {
                System.out.println("not present");
            }
        }

    }
//}
