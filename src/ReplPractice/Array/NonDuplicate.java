package ReplPractice.Array;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class NonDuplicate {
    public static void main(String[] args) {
        String nonDuplicate = "";
        int[] nums = {1, 1, 2, 3,2, 4, 3, 4};
        int count = 0;
        for(int i = 0;i< nums.length;i++){
                count =0;
            for(int j = 0;j < nums.length;j++){
                if(nums[j] == nums[i]){
                    count++;
                }
                if(count >= 2){

                }
                if(count < 2){
                    nonDuplicate += nums[j];
                }
            }


        }
        System.out.println(nonDuplicate);


            }

        }





