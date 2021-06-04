package day24_loops;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class CountUntil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to count until");
        int numToStop = scan.nextInt();
        int start = 0;
        while (start <= numToStop){
            System.out.print(start + " ");
            start++;
        }
    }


}
