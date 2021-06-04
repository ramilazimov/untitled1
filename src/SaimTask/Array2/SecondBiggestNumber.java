package SaimTask.Array2;

import OfficceHours04_14_2021.secondMax;

public class SecondBiggestNumber {
    public static void main(String[] args) {
        int [] nums= {4,3,1,4,5,2,4,7,5,8};
       int max = nums[0];
       int secondMAx = nums[0];
       for(int each: nums){
           if(each > max){
               secondMAx= max;
               max = each;
           }
           if(each > secondMAx && each < max){
               secondMAx = each;
           }
        }
        System.out.println("max " + max);
        System.out.println("secondMAx " + secondMAx);
    }
}
