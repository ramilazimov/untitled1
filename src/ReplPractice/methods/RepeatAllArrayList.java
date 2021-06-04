package ReplPractice.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatAllArrayList {
    public static void main(String[] args) {
        List<Boolean> booleanList = Arrays.asList(true,false,true);
        //repeatAll(); //how call this method?
    }
    public static void repeatAll(ArrayList<Boolean> list) {
        int count = list.size();
        for (int i = 0; i < list.size(); i++) {
            list.add(list.get(i));
        }
        System.out.println(list);
    }
}
