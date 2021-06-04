package ReplPractice.MethodsArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class PosSum {
    public static void main(String[] args) {
        ArrayList<Integer> newList1 = new ArrayList<>(Arrays.asList(1, 3, 5, 9, 7, -7, -8, 5, -5, 77));
        System.out.println(newList1);
        System.out.println(appendPosSum(newList1));


    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> lst) {
        int sum = 0;
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > 0) {
                newList.add(lst.get(i));
                sum += lst.get(i);
            }
        }
        newList.add(sum);
        return newList;
    }
}
