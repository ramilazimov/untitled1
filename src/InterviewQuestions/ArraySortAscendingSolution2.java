package InterviewQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraySortAscendingSolution2 {
    public static void main(String[] args) {
        int[] arr = {3,7,2,4,9,6};
        sortAsc(arr);
    }
    public static void sortAsc(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int each : arr){
            list.add(each);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i) < list.get(j)){
                    Integer temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
    }
}
