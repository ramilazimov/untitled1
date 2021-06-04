package day40_ArrayList;



import java.lang.reflect.Array;
import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
        //declare raw arraylist
         ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList();
        ArrayList list3 = new ArrayList();

        List list2 = new ArrayList();
        List list4 = new ArrayList();

        //add values
        list1.add("java");
        list1.add("apples");
        list1.add("coffee");
        list1.add(1234);
        list1.add(true);
        list1.add("Ramil");
        list1.add("wooden spoon");
        list2.add("ramil");
        list2.add("azimov");
        list2.add(43);
        list2.remove("azimov");

//        System.out.println(list1);
//        System.out.println("size = " + list1.size());
        System.out.println(list2 +"  " +  list2.size());
    }
}
