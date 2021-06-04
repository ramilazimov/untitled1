package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todayClass = "python";
        if(todayClass.equals("java"))
            System.out.println("java is fun");// only one statement attach to if without curly braces
        else                                   // if we have many statement we must use {}
            System.out.println(" its not java. it is " + todayClass);



        int score = 1;
        if(score == 1){
            System.out.println("lowest score 1");
        } else if(score == 2){
            System.out.println(" score is 2");
        } else if(score == 3){
            System.out.println(" score is 3");
        } else
            System.out.println("invalid score");


        int score1 = 1;
        if(score1 > 0)
            System.out.println("pass");
        System.out.println("your score is " + score1);

        int a = 1;
  if(a == 1)
      System.out.println(" a is 1");
        System.out.println("1 is a");


    }

}
