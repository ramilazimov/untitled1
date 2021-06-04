package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeArrayList {
    public static void main(String[] args) {

        String [] a = {"123" , "456", "789"};
        String [] b = {"abc" , "defg" , "hijk"};
        String [] c = {"@" , "$" , "#"};

        ArrayList<String[]> abc = new ArrayList<>(Arrays.asList(a, b, c));
        System.out.println(Arrays.toString(new String[]{abc.get(0)[1].substring(2)}));
        System.out.println(Arrays.toString(new String[]{abc.get(1)[1].substring(0, 1)}));
        System.out.println(Arrays.toString(new String[]{abc.get(1)[1].substring(2, 3)}));


    }


}
