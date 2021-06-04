package ElgunPractice;

public class Tomorrow {
    public static void main(String[] args) {
        String time = "tomorrow";

        char $ = '$';
        String charackter = "$";
        String timeRepl = time.replace('o','$');
        //System.out.println(timeRepl);
        for(int i =0;i<timeRepl.length();i++){
            if(timeRepl.charAt(i) == $){

              timeRepl += charackter;
            }
            }
        System.out.println(timeRepl);

        }


    }

