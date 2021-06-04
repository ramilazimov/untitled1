package HomeTasks;
 import java.util.Scanner;
public class IfStatementOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the age");

        int age = scan.nextInt();
        if(age>=18){
            System.out.println("Eligible for vote");
        } else {
            System.out.println("Not eligible for vote");
        }
    }
}
