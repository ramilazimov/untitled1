package OfficceHours_03_16_2021;

public class BMI {
    public static void main(String[] args) {
        double mass = 62.4;
        double height = 165;
        double BMI = mass / (height * height);

        if(BMI < 18.5){
            System.out.println("UnderWeight");
        } else  if(BMI >= 18.5 && BMI < 25){
            System.out.println(" Normal weight");
        } else if (BMI >= 25 && BMI < 30){
            System.out.println("Over weight");
        } else {
            System.out.println(" Obese");
        }
        }

}
