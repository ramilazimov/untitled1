package ReplPractice.Array;
import java.util.*;
public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] temps = {80,88,88,84,82,78,60,68};
        double sum = 0;
        double average = 0;
         for(double each:temps){
             sum += each;
             average = sum/ temps.length;

         }
        System.out.println(average);

        }

    }

