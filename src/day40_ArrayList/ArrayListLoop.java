package day40_ArrayList;
import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(); //Polymorphic way of declaring
        System.out.println(nums);
        System.out.println("size = " + nums.size());

        nums.add(34); nums.add(44); nums.add(3); nums.add(88);
        nums.add(500); nums.add(5);nums.add(845);nums.add(0);
        nums.add(500); nums.add(5);nums.add(845);nums.add(0);
        nums.add(177);


//       System.out.println("nums = " + nums);
//
//        nums.remove(3);
//        nums.remove(4);
//        nums.add(4,new Integer(4));
//        System.out.println("nums = " + nums);
//
//        //nums.remove(88); -> index 88 -> IndexOutOfBoundsException
//        nums.remove(new Integer(88)); //removes number 88. not 88th index
//        System.out.println("nums = " + nums);
//
//        nums.remove(new Integer(5));
//        System.out.println("nums = " + nums);

        //for loop - iterate through all values and print

        System.out.println("nums = " + nums);
        for (int i = 0;i < nums.size();i++){
            System.out.print(nums.get(i)+ " ");
            if(nums.get(i)==5){
                nums.remove(i);
            }
        }

        //for each loop, and print all in same line
        for(int each : nums) {
            System.out.print(each +" ");

        }

        System.out.println("nums = " + nums);
    }
}
