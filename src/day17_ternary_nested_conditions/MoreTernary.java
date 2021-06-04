package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 57;
        String reply = (hourlyRate > 55) ? "accept" : "reject";
        System.out.println("reply = " +reply);


        String todayClass = "java";
        String teacher = (todayClass.equals("java")) ? "Murodil" : "Nadir";
        System.out.println(" todays teacher = " + teacher );

        boolean isEligibleToDrive = true;
        String driving = (isEligibleToDrive)? "have Dl, can drive" : "no DL cant drive";
        System.out.println("driving = " + driving);



    }
}
