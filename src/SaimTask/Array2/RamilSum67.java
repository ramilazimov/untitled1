package SaimTask.Array2;

import java.util.Arrays;

public class RamilSum67 {
    public static void main(String[] args) {
        int[] arr = {2,7,6,2,7,2,7};
        int countOf6 = 0;
        int countOf7 = 0;
        int sum = 0;
        int indexOf6 =0;
        int indexOf7=0;

        int sumBetween67= 0;
        int sumUntil6 = 0;
        int totalSum = 0;
        for(int a = 0; a < arr.length; a++){

            if(arr[a] == 6){
                indexOf6 = a;
                countOf6++;
            } else if(arr[a] == 7){
                indexOf7=a;
                countOf7++;
            }
            if(countOf6 >=1 && countOf7 == 1){
                if(indexOf7 > indexOf6){
                    if(arr[a] != 6 && arr[a] != 7 ){
                        sumBetween67 +=arr[a];
                    }

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