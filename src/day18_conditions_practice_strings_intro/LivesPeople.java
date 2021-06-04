package day18_conditions_practice_strings_intro;

public class LivesPeople {
    public static void main(String[] args) {
        String citizenship = "yes";
        boolean resident = true;
        boolean HasDiploma = true;
        int age = 45;

        if (citizenship.equals("!Yes")) {
            System.out.println("you must be resident");

        } else if(!(age >= 18 && age <= 35)){
            System.out.println("you must be between 18 and 35");
        } else if(!HasDiploma){
            System.out.println("you must have diploma");
        } else if((citizenship.equals("!Yes")) && (age >= 18 && age <= 35) && HasDiploma == true  ){
            System.out.println(" you are qualified for US army");
        }
    }

        }













