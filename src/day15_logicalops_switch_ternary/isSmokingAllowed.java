package day15_logicalops_switch_ternary;

public class isSmokingAllowed {
    public static void main(String[] args) {
        boolean isSmokingAllowed = true;
        if(!isSmokingAllowed){
            System.out.println(" Smoking is not allowed");
        } else {
            System.out.println(" This area is for smoking");
        }

        boolean isAffordable = true;
        if(!isAffordable){
            System.out.println(" item not affordable ");
        }

        String carModel = "Tesla";
        if(!carModel.equals("Tesla")){
            System.out.println(" i am not interested" + carModel);
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if(!(secretPassword.equals("abc123"))){
            System.out.println("Incorrect password");
        }

        if (inputPassword.equals(secretPassword)){
            System.out.println("Incorrect password");
        }
    }
}
