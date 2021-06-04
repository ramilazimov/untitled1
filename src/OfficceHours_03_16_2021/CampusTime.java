package OfficceHours_03_16_2021;

public class CampusTime {
    public static void main(String[] args) {
        int time = 8;
        if(time < 0 || time > 24){
        System.out.println("invalid time");
    } else if(time >= 8 && time <23){
        } else {
            System.out.println("campus is closed");
        }
    }


}
