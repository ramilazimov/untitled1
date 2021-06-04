package day20_String_Manipulation_methods;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains(" l o"));
        System.out.println(company.contains("j"));
        System.out.println(company.contains("One"));

        if(company.contains(" ")){
            System.out.println("multiple words");
        } else {
            System.out.println("single words");

        }
        String etsyTitle = "Wooden spoon | Etsy";
        if(etsyTitle.contains(" | ")){
            System.out.println("pass  - title check passed");
        } else System.out.println("Failed - title check failed");

        String firstName = "Ahmed";
        if(firstName.contains("A") && firstName.contains("e")){
            System.out.println(" both a and e present");
        } else {
            System.out.println(" a and e not present");
        }
        firstName = "Nadir";
        if(firstName.contains("a") || firstName.contains("i")){
            System.out.println(" a or i is present");
        } else{
            System.out.println(" a or i is not present");
        }
        String email = "ramil.azimov@gmail.com";
        if(email.contains("@") && email.endsWith(".com")){
            System.out.println(" email is correct");
        } else {
            System.out.println("not correct email");
        }
 if(email.toLowerCase().contains("d")){ // case insensitive contain
     System.out.println(" d is present ");
 } else {
     System.out.println(" d is not present");
 }
    }


}
