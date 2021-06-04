package day17_ternary_nested_conditions;

public class TeslaNestedIf {
    public static void main(String[] args) {
        char model = 'S';
        String trim = "Plaid";
        int topSpeed = 200;
        if(model == 'S'){
            if(trim.equals("long range")){
                model = 'S';
                topSpeed = 155;
                System.out.println("Model is " + model + " trim is " + trim + " speed is " + topSpeed);

            } else{

            }


        } else if(trim == "Plaid"){
            model = 'S';
            topSpeed = 200;
            System.out.println("Model is " + model + " trim is " + trim + " speed is " + topSpeed);
        } else if(trim == "Plaid+"){
            model = 'S';
            topSpeed = 220;
            System.out.println("Model is " + model + " trim is " + trim + " speed is " + topSpeed);
        }





    }

}

