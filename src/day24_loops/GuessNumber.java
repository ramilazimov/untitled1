package day24_loops;


import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
//        int secretNumber = 77;
//        int guessingNumber;
//        do {
//            System.out.println("guess the secret number");
//            guessingNumber = scan.nextInt();
//            if(guessingNumber > secretNumber){
//                System.out.println(" Wrong, your number is too large");
//
//                } else if(guessingNumber < secretNumber){
//                System.out.println(" wrong, your number is too short");
//            }
//        }while (secretNumber != guessingNumber);
//        System.out.println(" you won!");


        Random randomNum = new Random();
        // System.out.println(randomNum.nextInt(101));
        Scanner scan = new Scanner(System.in);
        int secretNumber = randomNum.nextInt(101);
        int guessingNumber = 0;
        do {
            System.out.println("guess the secret number");
            //guessingNumber = scan.nextInt();
            guessingNumber++;
            if (guessingNumber > secretNumber) {
                System.out.println("wrong too large");

            } else if (guessingNumber < secretNumber) {
                System.out.println("wrong number is too small");

            }

        } while (secretNumber != guessingNumber) ;
        System.out.println("you won - " + secretNumber);

    }
}