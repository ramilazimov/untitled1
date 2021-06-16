package InterviewQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UniqueIntegersSumUpTo_0_2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution(7)));
    }
  public static int[] Solution(int N){
      int[] result = new int[N];
      int sum = 0;
      for (int i = 0; i < N - 1; i++) {
          result[i]= i;
          sum += i;
      }
      result[N-1] = -sum;
      return result;
  }
}
