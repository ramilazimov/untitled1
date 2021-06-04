package SaimTask.arrayTask;
import java.util.*;
public class NumberArray100 {
    public static void main(String[] args) {
        Random random = new Random ();
//        int [] num = {1,2,3,4,4,53,44,55,66,665,6,565,65,5,64,56,5,656,6,6,};
        int[] numbers = new int[10];
        for(int i = 0; i <numbers.length;i++){
            numbers[i] = random.nextInt(20);
            System.out.println(numbers[i]);
        }
    }
}
