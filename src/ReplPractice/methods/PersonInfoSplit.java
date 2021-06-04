package ReplPractice.methods;

import java.util.Scanner;

public class PersonInfoSplit {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("enter string");
        String s = input.next();
        person(s);

    }
   public static void person(String info){
       String[] split = info.split(",");
       System.out.println("person name: " +split[0]+ " last name: "+ split[1]+ " age: " + split[2]);
   }
}
