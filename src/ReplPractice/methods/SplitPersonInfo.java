package ReplPractice.methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitPersonInfo {
    public static void main(String[] args) {
        person("ramil,Azimov,43");

    }
    public static void person(String info){
        // info = "jon,doe,30";
         String[] s = info.split(",");

        System.out.println("person name: "+ s[0]+
                "\nlast name: " + s[1]+ "\nage: "+ s[2]);

    }


}
