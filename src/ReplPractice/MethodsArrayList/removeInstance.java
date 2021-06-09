package ReplPractice.MethodsArrayList;

import jdk.nashorn.internal.runtime.AllocationStrategy;

import java.util.ArrayList;
import java.util.Arrays;

public class removeInstance {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        Integer[] nums = new Integer[]{2,2,45,67,2,67,77,6,77,45};
        lst.addAll(Arrays.asList(nums));
        System.out.println(removeInst(lst, 77));

    }
    public static ArrayList<Integer> removeInst(ArrayList<Integer> lst,Integer n){
//        for (int i = 0; i < lst.size(); i++) {
//                if(lst.get(i) == n){
//                    lst.remove(i);
//                    i--;
//                }
//        }
//        ---------------------------------------------------------
//        lst.removeAll(Arrays.asList(n));
     lst.removeIf(each -> each == n);

        return lst;

    }


}
