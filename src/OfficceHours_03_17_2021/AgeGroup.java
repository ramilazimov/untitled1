package OfficceHours_03_17_2021;

public class AgeGroup {
    public static void main(String[] args) {

        int age = 10;
        if(age > 0 && age < 120) {
            if(age <= 2){
                System.out.println("infant");
            } else if(age >= 3 && age <= 5 ) {
                System.out.println("toddler");
                // 3<= age <=5 - not possible in Java
            } else if( age >= 6 && age <= 9){
                System.out.println("kid");
            }

        } else {
            System.out.println("Invalid age");
        }
    }
}
