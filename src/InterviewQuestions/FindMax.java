package InterviewQuestions;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.sql.Array;
import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {
        int[] nums  = {3,5,77,9,12};
        System.out.println(findMax(nums));
    }


    public  static int findMax(int[] nums){
        int max = nums[0];
      for (int each : nums){
          if(each > max){
              max = each;
          }
      }
      return max;

    }
}
