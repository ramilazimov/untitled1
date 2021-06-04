package day18_conditions_practice_strings_intro;

public class FizzBazz {



    public static void main(String[] args) {
        int num = 4;
        ;
        if(num % 3 == 0 && num % 5 == 0){
            System.out.println(" FizzBazz");
        } else if(num % 3 == 0 ){
            System.out.println("Fizz");
        } else if ( num % 5 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(" no Fizz no Bazz");
        }
    }
}
// control/command + shift + F - universal searching in project