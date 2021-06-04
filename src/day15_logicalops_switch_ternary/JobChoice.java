package day15_logicalops_switch_ternary;
// // location. salary, benefits, remote
public class JobChoice {
    public static void main(String[] args) {
     String location = "NY";
     double salary = 120_000.00;
     boolean isBenefits = true;
     boolean isRemote = true;
     if(location.equals("NY") && salary >= 120_000.00  && isBenefits && isRemote ){
         System.out.println(" I accept this offer");
     } else {
         System.out.println("I need time to think about");
     }
    }
}
