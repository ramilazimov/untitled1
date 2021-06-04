package ReplPractice.methods;
import java.util.*;

public class FindCube {
    public static void main(String[] args) {
        cube();

    }
    public static void cube(){
        int input = 0;
        int cubeNumber = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your number");
        input = scan.nextInt();
        cubeNumber = input*input*input;
        System.out.println(cubeNumber);


    }


}
