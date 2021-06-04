package day14_multi_branch_if_statements;

public class PracticeLogicalANDOperators {
    public static void main(String[] args) {
        int year = 2024;
        if(year == 2020){
            System.out.println("wear a mask ");
        }
        System.out.println("keep coding java");



        String country = "GB";
        if(country.equals("USA")){
            System.out.println(" Washington DC is capital ");
        }
        System.out.println("welcome to " + country);

        int day = 4;
        if(day == 1){
            System.out.println("Monday");
        }
        if(day == 2){
            System.out.println("Tuesday");
        }
        if(day == 3){
            System.out.println("Thursday");
        }

        System.out.println(" choose your language");

        int selection = 2;
        if(selection == 1){
            System.out.println("hello, thanks for your call");
        } else if(selection == 2){
            System.out.println("hola, gracias para llamar");
        } else if(selection == 3){
            System.out.println("merhaba, radiginiz ucun tewekkurler");
        } else if(selection == 4){
            System.out.println("privet, spasibo za zvonok");
        } else {
            System.out.println("lets talk java and english");
        }

    }
}


