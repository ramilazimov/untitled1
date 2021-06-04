package day33_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RverseArray {
    public static void main(String[] args) {

//        String[] words = {"ramil","elgun","suleyman","bewir","nadir"};
//        String[]newWords = new String[words.length];

//        for(int i = words.length-1;i>=0;i--){
//             newWords[i] = words[words.length-1-i];
//            System.out.print(words[i] + " ");
//        }
//         longest way to do it
        int[] nums = {5,10,4,100};
        int[] newNUms = new int[nums.length];//{0,0,0,0}
        for(int i = nums.length-1, j=0; i >= 0; i--, j ++){
            newNUms[j] = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(newNUms));

    }
}
