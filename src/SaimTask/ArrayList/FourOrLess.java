package SaimTask.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apples","tree","loop","cat",
                "animal","shortcut"));
        ArrayList<String> newFruitsArrays = new ArrayList<>();

            for(String each:fruits){
                if(each.length()<=4){
                    newFruitsArrays.add(each);
                }
            }
       for (String each:newFruitsArrays){

       }
        System.out.println(newFruitsArrays);

                }

            }





