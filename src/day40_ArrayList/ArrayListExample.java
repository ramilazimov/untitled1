package day40_ArrayList;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> integer = new ArrayList<>();
        integer.add(5);
        integer.add(7);
        integer.add(9);
        integer.add(10);
        integer.add(7);
        System.out.println("integer = " + integer);
        System.out.println(integer.get(1));
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Double> num = new ArrayList<>();
        num.add(12.45);
        System.out.println(num);
        nums.add(5);
        nums.add(7);
        nums.add(11);
        //nums.add("java"); ERROR
        System.out.println(nums);
        System.out.println(num.get(0) + "   " + num.size());

        System.out.println("size = " + nums.size());

        //reading from arraylist
        System.out.println("index 0 = " + nums.get(0));
        System.out.println("index 1 = " + nums.get(1));
        System.out.println("index 2 = " + nums.get(2));
        //System.out.println(nums.get(3)); indexOutOfBoundsException

        //print all values in same line:
        System.out.println(nums); //Arrays.toString(numArray)

        nums.remove(1); //remove element at index 1
        nums.remove(1);

        System.out.println(nums);

    }
}
