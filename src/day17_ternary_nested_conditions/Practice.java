package day17_ternary_nested_conditions;

public class Practice {
    public static void main(String[] args) {
        int hourlyRate = 57;
        String reply;
//        String reply = (hourlyRate > 55)? "accept" : "reject";
//        System.out.println("reply is " + reply);
if(hourlyRate > 55){
    reply = "accept";
} else {
    reply = "reject";
}
        System.out.println("reply is " + reply);

    }
}
