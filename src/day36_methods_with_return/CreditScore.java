package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
//        checkEligible(780);
//        checkEligible(815);
        checkEligible(400);
//        System.out.println(getCreditScore());
        int score = getCreditScore();
        System.out.println(score);
    }
    public static void checkEligible(int creditScore){

        if(creditScore>= 700){
            System.out.println("you are eligible for this car");
        } else {
            System.out.println("Soryy, you are not eligible for leasing car");
        }

    }
    public static int getCreditScore(){
        return 800;
    }
}
