package SaimTask;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
public class PersonalInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many people you live with? ");
        int livesWithPeople = input.nextInt();
        if (livesWithPeople <= 2) {
            System.out.println("live with less than 2 people");
        } else if (livesWithPeople >= 3 && livesWithPeople <= 6) {
            System.out.println("live with 3-6 people");
        } else if (livesWithPeople > 6) {
            System.out.println("live with more than 6 people");
        }
        System.out.println("what city do you live?");
        String whatCity = input.next();

        System.out.println(" do you live in downtown?");
        String liveInDowntown = input.next();
        if (liveInDowntown.equals("yes")) {
            System.out.println("have you thought moving to suburbs?");
            String movingToSuburbs = input.next();
          if(movingToSuburbs.equals("yes")){
              System.out.println("do it its great");
          } else{
              System.out.println("you should think about");
          }



            } else {
            System.out.println(" keep living there");
        }
        System.out.println("whats your favourite animal?");
        String favAnimal = input.next();
        System.out.println("wow " + favAnimal + " is a great animal");
        System.out.println("how many pets you want?");
        String numOfpets = input.next();
        System.out.println("Interesting, do you want  " + numOfpets + " " + favAnimal + "?");

        }

    }






