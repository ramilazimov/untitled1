package day26_ForLoop;

public class WeekDays {
    public static void main(String[] args) {
        for( int n = 1; n <= 10; n++ ){
            switch (n){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Froiday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("No weekdays");
                    break;
            }

        }
    }


}
