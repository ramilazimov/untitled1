package day17_ternary_nested_conditions;

import com.sun.deploy.security.SelectableSecurityManager;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "drink";
        String drink = "coke";
        String snack = "chips";

        if(selection.equals("drink")){
            System.out.println("drink is selected");
            if(drink.equals("tea")){
                System.out.println("tea is selected");
            } else {
                System.out.println("coke is selected");
            }
        } else  if(selection.equals("snack")){
            System.out.println("snack is selected");
            if(snack.equals("chips")){
                System.out.println("chips is selected");
            } else {
                System.out.println("candy is selected");
            }
        }




    }
}
