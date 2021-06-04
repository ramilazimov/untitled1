package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'd';
        if((grade == 'A' || grade == 'a') || (grade == 'B' || grade == 'b')){
            System.out.println("passed with grade  - " + grade);
        } else if (grade == 'D' || grade == 'd'){
            System.out.println(" you are qualify for retake. Grade - " + grade);
        } else if(grade == 'E') {

            System.out.println(" fail");

    } else {
            System.out.println("invalid " + grade);
        }
    }
}
