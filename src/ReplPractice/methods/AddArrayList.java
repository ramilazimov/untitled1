package ReplPractice.methods;

import java.util.ArrayList;

public class AddArrayList {
    public static void main(String[] args) {
        System.out.println(test());
    }
   public static ArrayList<String> test(){
      ArrayList<String> names = new ArrayList<>();

      names.add("Ramil");
      names.add("Azimov");
      names.add("SDET");
      names.add("in Amazon");
      return names;

   }

}
