package ReplPractice.methods;

import java.util.*;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int n = input.nextInt();
        fibo(n);
    }


    public static void fibo(int n) {
           int fiboNum = 0;
        int[] fiboArr = new int[n + 1];
        fiboArr[1] = 1;
        for (int i = 2; i < fiboArr.length; i++) {
            fiboArr[i] = fiboArr[i - 2] + fiboArr[i - 1];

            fiboNum = fiboArr[n];
        }
        System.out.print(fiboNum);




    }
}