
package ReplPractice.MethodsArrayList;

import sun.rmi.server.InactiveGroupException;

import java.util.ArrayList;
import java.util.Arrays;

public class twoTimesParametr {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Integer[] nums  = new Integer[]{1,1,2,3,4,5,5,6};
        list.addAll(Arrays.asList(nums));
        System.out.println(twoTimes(list));
    }
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                }
            }
            if (count == 1) {
                list.add(list.get(i));
            }
        }
        return list;
    }


}
