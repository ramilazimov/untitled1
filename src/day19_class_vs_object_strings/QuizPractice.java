package day19_class_vs_object_strings;
import java.util.Scanner;
public class QuizPractice {
    public static void main(String[] args) {


  Scanner input = new Scanner(System.in);
        System.out.println("enter you pwd and username");
        String userName = input.next();
        String pwd = input.next();
         String validUserName = "ramil";
         String validPwd = "123";
         if(userName.equals(validUserName) && pwd.equals(validPwd)){
             System.out.println("access granted");
        } else {
             System.out.println("access denied");
         }


    }
}
