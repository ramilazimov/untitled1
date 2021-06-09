package ReplPractice.MethodsArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class searchElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String [] words = new String[]{"ramil","azimov","SDET","Amazon","some"};
      list.addAll(Arrays.asList(words));
        System.out.println(search(list, "123"));
    }
    public static String search(ArrayList<String> lst, String find){
        for (int i = 0; i < lst.size(); i++) {
            if(lst.get(i).equalsIgnoreCase(find)){
                return lst.get(i);
            }
        }
        return "search failed!!!";

    }
}
