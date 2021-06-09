package day40_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayInsideArrayList {
    public static void main(String[] args) {
      ArrayList<String[]>arrList = new ArrayList<>();
      arrList.add(new String[]{"1","Ramil","SDET","Amazon"});
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(Arrays.toString(arrList.get(i)));
        }
    }
}
