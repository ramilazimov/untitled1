package day18_conditions_practice_strings_intro;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
        int month = 21;


        if(month == 1 || month == 12 || month == 2){
            System.out.println("winter");
        }
        switch (month){
            case 12 :
                System.out.println("winter");
            case 1 :
                System.out.println("winter");
            case 2:
                System.out.println("winter");
                break;

        }
        switch (month){
            case 1:
            case 12:
            case 2:
                System.out.println("winter");
                break;
            case 3: case 4: case 5:
                System.out.println("spring");
                break;
            case 6: case 7: case 8:
                System.out.println("summer");
                break;
            case 9: case 10: case 11:
                System.out.println("fall");
                break;
            default:
                System.out.println("invalid month - " + month);

        }
    }
}
