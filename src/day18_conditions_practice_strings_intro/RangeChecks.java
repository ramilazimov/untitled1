package day18_conditions_practice_strings_intro;

public class RangeChecks {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        if( num1 >= 1 && num2 <= 40){
            System.out.println('D');
        } else if (num1 >= 40 && num2 <= 60){
            System.out.println('C');
        } else if (num1 >= 60 && num2 <= 90){
            System.out.println('B');
        } else if (num1 >= 90 && num2 <= 100){
            System.out.println('A');
        } else {
            System.out.println("invalid score");

            int score = 77;
            if(score >= 1 && score <= 40){
                System.out.println("Grade D");
            } else if (score >= 40 && score <= 60){
                System.out.println("garde C");
            } else if (score >= 60 && score <= 90){
                System.out.println(" Grade B ");
            } else if (score >= 90 && score <= 100){
                System.out.println("Grade A");
            } else {
                System.out.println(" invalid score");
            }
        }
    }
}
