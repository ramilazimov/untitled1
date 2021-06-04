package day14_multi_branch_if_statements;

public class MultiBranchIfStatements {
    public static void main(String[] args) {
        int day = 3;
        if(day == 1){
            System.out.println("Monday");
        }

         else  if (day == 2 ){
            System.out.println("Tuesday");

        } else
        if(day == 3){
            System.out.println("Wednesday");
        } else if(day == 4){
            System.out.println("Thursday" +
                    "");
        }
        else {
            System.out.println("everyday code java");
        }// using else useful. comp when finding right answer it will stop go further. when million people will use same code
        }// same time it is good for comp save time for checking up
    }// adding else at the end usefull because when answer non of values above then its gonna show the last else

