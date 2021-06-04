package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        double itemPrice = 170.0;
        boolean isPrimeMember = false;
        if(isPrimeMember){
            System.out.println("eligible for free 2 day shipping");
        } else {
            if(itemPrice >= 25.0){
                System.out.println("eligible for regular shipping");
            } else{
                System.out.println("not eligible for free shipping");
            }

        }

    }
}
