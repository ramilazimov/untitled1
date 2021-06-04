package day14_multi_branch_if_statements;

public class practice {
    public static void main(String[] args) {
        System.out.println("you wanna delete this file?");
        char selection = 'y';
        boolean answer = true;
        if(selection != 'y'){
            System.out.println("your file will be deleted");
            answer = true;
        }  else {
            System.out.println("file deletion cancelled");
            answer = false;
        }
        System.out.println("Did file deleted - " + answer);

        String weather = "windy";
        if(weather.equals("sunny")){
            System.out.println("go to park");
        } else if(weather.equals("rainy")){
            System.out.println("stay home");
        }  else if(weather.equals("windy")){
            System.out.println("get ready for  fours major ");
        } else if(weather.equals("snowy)")){
            System.out.println("clean the car");
        } else  {
            System.out.println(weather + " just keep coding java");
        }

        }
    }


