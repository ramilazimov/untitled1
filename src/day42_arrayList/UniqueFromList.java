package day42_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>(Arrays.asList(12.3,45.6,77.8,77.7));
        System.out.println("doubleList = " + doubleList);
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,4,4,1,5,6,0,6));
        //int frequenceOf1 = Collections.frequency(nums,1);
        System.out.println(nums);
        List<Integer> unqueList = getUniqeInteger(nums);
        System.out.println(unqueList);
    }
   public static List<Integer> getUniqeInteger(List<Integer> nums){
        List<Integer> unqueList = new ArrayList<>();
        for(int each : nums){
            if(Collections.frequency(nums,each) == 1){
                unqueList.add(each);
            }
        }
        return unqueList;
   }

//    public static List<Integer> getUniqeInteger(List<Integer> nums) {
//        List<Integer> unqueList = new ArrayList<>();
//        for(int each: nums){
//            if(Collections.frequency(nums,each) == 1){
//                unqueList.add(each);
//
//            }
//        }
//        return unqueList;
//    }
}
/*
Extract method - its automated making method
Select code-right click- refactor-extract method
 */

