package OfficceHours_03_09_2021;
import java.util.Scanner;
public class day03_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the seasons number : \n1- Spring\n2-Summer\n3-Fall\n4-Winter");
        int season = scan.nextInt();
        int day = 0;
        int night = 0;
        String seasonName = "";

        if(season == 1){
           day = 14;
           night = 10;
           seasonName = "Spring";
        }

        if(season == 2){
            day = 16;
            night = 8;
            seasonName = "Summer";

        }

        if(season == 3){
            day = 14;
            night = 12;
            seasonName = "Fall";
        }

        if(season == 4){
            day = 12;
            night = 12;
            seasonName = "Winter";
        }
        System.out.println("In " + seasonName + "there is " + day + " hours of dayLight and " + night + " hours in night");
    }


}
