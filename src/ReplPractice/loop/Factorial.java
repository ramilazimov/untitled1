package ReplPractice.loop;
import  java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter factorial number");
        int n = input.nextInt();
        long result = 1L;
        for(int i = n;i>=1;i--){
            result = result *i;
        }


        System.out.println(result);

    }
}
