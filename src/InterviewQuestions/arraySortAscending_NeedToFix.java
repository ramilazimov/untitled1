package InterviewQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arraySortAscending_NeedToFix {
    public static void main(String[] args) {
        int[] n = new int[]{3, 7, 1,  9, 5};
        System.out.println(Arrays.toString(Sort(n)));
    }
  public static int[] Sort(int[] a) {
      ArrayList<Integer> list = new ArrayList<>();
      for (int each : a) {
          list.add(each);
      }
      for (int i = 0; i < list.size(); i++) {
     a[i] = Collections.min(list);
     list.remove(Integer.valueOf(a[i]));
      }
      return a;
  }
}
