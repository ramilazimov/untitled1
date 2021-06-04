package SaimTask.loops3;
import java.util.*;
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number ");
        int number = input.nextInt();

        for (int j = 2; j <= number; j++) {
              boolean isPrime = true;

            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                  isPrime = false;
                    break;


                }

                }
            if(isPrime){
                System.out.print(j + " ");
                }
            }



            }
        }


