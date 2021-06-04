package day19_class_vs_object_strings;
import java.util.Scanner;
public class QualificationForArmy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("##### US Army qualification #####");
        System.out.println("are you resident or citizen? ");
        boolean resident = input.nextBoolean();
        System.out.println("Have you diploma");
        boolean haveDiploma = input.nextBoolean();
        System.out.println("enter your age");

        int age = input.nextInt();
        if(resident && haveDiploma && (age >= 18 && age<= 35)){
            System.out.println("you are qualified for the US Army");
        }else {
            if(!resident){
                System.out.println("you must be a U.S citizen or a resident");
            }  else if(!(age >= 18 || age <= 35 )){
                System.out.println("your age must be between 18 to 35 " + "\n" +  "your age is " + age );
            }  else {
                System.out.println("you must have a high school diploma");
            }
        }

    }
}
