package day42_arrayList;

import day41_arraylist.ArrayAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    /**
     * methodName: printStrList
     * param: List of Strings
     * return: void
     * prints all values separated by space in same line
     * @param args
     */
    public static void main(String[] args) {
       List<String>words = new ArrayList<String>();
       words.add("Ramil");words.add("Azimov");words.add("SDET");words.add("Amazon");
       printStrList(words);
       List<Integer> num = Arrays.asList(1,2,3,4,4,5);
       int sum = sumIntegerList(num);
        System.out.println(sum + " ");


    }
    public static void printStrList(List<String>stringList){
        for(String each: stringList){
            System.out.print(each + "");
        }

    }
    public static int sumIntegerList (List<Integer> integers){
        int sum= 0;
        for(int each:integers){
            sum  +=each;
        }
        return sum;

    }
}
