package ElgunPractice;
import javax.swing.plaf.IconUIResource;
import java.util.*;
public class ArraysPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num [] = new int[input.nextInt()];
//         num[0] = 7;
//         num[1] = 9;
//         num[2] = 15;
//         num[3] = 21;
//         num[4] = 25;

        System.out.println("enter your number");
          int totalSum = 0;
          int count = 0;
        int average = 0;
        for(int i = 0; i < num.length;i++){
            num[i] = input.nextInt();
            totalSum += num[i];

            }
        average = totalSum/num.length;
        for (int each:num){

           if(each > average){
               count++;
           }

        }
        System.out.println(count);
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println(num[num.length-1]);

        }
//        System.out.println(Arrays.toString(num));
//
//       for (int each : num){
//
//           System.out.print(each + " ");
//
//       }


    }

