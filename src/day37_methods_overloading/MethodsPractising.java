package day37_methods_overloading;

import java.util.Scanner;

public class MethodsPractising {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("enter size");
        int size = input.nextInt();
       int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter elements");
            arr[i] = input.nextInt();
        }
        plus_minus(arr);
    }
 public static void plus_minus(int[] num){
     int countP=0,countN=0,count0=0;
     for(int each : num){
         if(each > 0){
             countP++;
         }else if(each==0){
             count0++;
         } else {
             countN++;
         }
     }
     System.out.println("pozitive: " + countP + " negative: " + countN + " zero: " + count0);
 }
}
