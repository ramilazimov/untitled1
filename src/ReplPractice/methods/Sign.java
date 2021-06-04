package ReplPractice.methods;
import java.util.*;
public class Sign {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

       sign(5);

    }
    public static void sign(int n){


            if(n > 0){
            System.out.println("positive");
        }
        if(n < 0){
            System.out.println("negative");
        }
        if(n == 0){
            System.out.println("zero");
        }

    }
}
