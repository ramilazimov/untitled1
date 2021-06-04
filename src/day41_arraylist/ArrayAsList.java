package day41_arraylist;

import sun.rmi.server.InactiveGroupException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
    public static void main(String[] args) {
        List<Integer> nums  = Arrays.asList(23,1,34,54,654);
     //   System.out.println("nums = " + nums);
      List<Integer> numsList = new ArrayList<>(Arrays.asList(4,2,4,23,5344,100));

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(3,4,5,6,7,8,9));
        nums1.add(45);
        nums1.add(21);
        nums1.add(34);
        nums1.add(55);
        System.out.println("nums1 = " + nums1);
        numsList.add(33);
        numsList.add(55);
       // System.out.println("numList = " + numsList);
        numsList.remove(0);
        numsList.remove(new Integer(23));
  numsList.remove(new Integer(45));
       // System.out.println("numList = " + numsList);
        List<String> drinksWithCoffeine = new ArrayList<>(Arrays.asList("coffee","tea","monster","red bull","coke","monster"));
       // System.out.println(drinksWithCoffeine);
        int caffeineAmount = 0;
        for(String each : drinksWithCoffeine){
            if(each.equals("monster") || each.equals("red bull") || each.equals("coke")){
                caffeineAmount = 150;
             //   System.out.println(each + " --> " + caffeineAmount);
            } else if(each.equals("coffee") || each.equals("tea")){
                caffeineAmount = 112;
             //   System.out.println(each + " -->" + caffeineAmount);
            }
        }
        for(String drink : drinksWithCoffeine){
            switch (drink){
                case "coffee": case "red bull":
                    caffeineAmount = 150;
                   // System.out.println(drink + "-->" + caffeineAmount);
                    break;
                case "tea": case "monster":
                    caffeineAmount = 112;
                  //  System.out.println(drink + "-->" + caffeineAmount);
                    break;

            }
        }
        drinksWithCoffeine.forEach(drink -> System.out.println(drink));
        drinksWithCoffeine.forEach(each -> {
            System.out.println("------------");
            System.out.println("each = " + each);
            System.out.println("---------------");

        });



        }

    }

