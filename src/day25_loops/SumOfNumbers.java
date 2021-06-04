
package day25_loops;

public class SumOfNumbers {
    public static void main(String[] args) {
     int sum = 0;
//        for(int sum = 1; sum <= 5 ;  sum = sum +=1){
//            System.out.println("sum is = " + sum);
           for(int i = 1; i <= 100; i++ ){
               System.out.println(i);
               sum +=i;
           }
        System.out.println("sum = " + sum);
        }
    }

