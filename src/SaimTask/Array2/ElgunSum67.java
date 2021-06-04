package SaimTask.Array2;
import java.util.*;

import com.sun.deploy.util.ArrayUtil;
import day31_arrays.ArraysUtil;
import day38_methods.ArraysUtils;

public class ElgunSum67 {
    public static void main(String[] args) {
        int[] arr = {2,6,7,2,6,2,7};
        int countOf6 = 0;
        int countOf7 = 0;
        int sum = 0;

        int sumBetween67= 0;
        int sumUntil6 = 0;

        int totalSum = 0;
        for(int a = 0; a < arr.length; a++){
            if(arr[a] == 6){
                countOf6++;
            } else if(arr[a] == 7){
                countOf7++;
            }
            if(countOf6 >=1 && countOf7 == 1){

                if(arr[a] != 6 && arr[a] != 7 ){
                   sumBetween67 +=arr[a];
                }
            }
            if(countOf6 ==2 && countOf7 == 2){
                sum += arr[a];
            }
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 6) {
                sumUntil6 += arr[i];

            } else if(arr[i] == 6){
                break;
            }
        }
        totalSum = sumUntil6 + sumBetween67 + sum;
        System.out.println(totalSum);
    }
}
