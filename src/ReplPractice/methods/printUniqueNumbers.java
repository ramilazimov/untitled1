package ReplPractice.methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class printUniqueNumbers {
    public static void main(String[] args) {
        int[] input = {2,5,6,3,6,9,34,3};
        int count = 0;
        int count1 = 0;

        for(int i =0;i < input.length;i++){
            count =0;
            for(int j =0;j < input.length;j++){

                if(input[j] == input[i]){
                    count++;
                }
                }
            if(count < 2){
                count1++;

// need complete this task
                }

            }
        System.out.println(count1);

        }
    }

