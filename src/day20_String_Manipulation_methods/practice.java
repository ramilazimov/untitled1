package day20_String_Manipulation_methods;

import java.util.Locale;

public class practice {
    public static void main(String[] args) {
        String action = "UFC fighter";
        System.out.println(action.isEmpty());
        System.out.println(action.startsWith("u"));
        System.out.println(action.endsWith("ter"));
        System.out.println(action.contains("FC"));
        System.out.println(action.replace("UFC", "ufc"));
        System.out.println(action.toLowerCase().startsWith("u"));
        System.out.println(action.toUpperCase().endsWith("TER"));
        System.out.println(action.toLowerCase().contains("u"));
        System.out.println(action.length());

        String emailCheck = "ramil.azimov@gmail.com";
        if(emailCheck.contains("@") && emailCheck.contains(".com")){
            System.out.println("correct email");
        } else {
            System.out.println(" incorrect email");
        }
  if(emailCheck.contains(" ")){
      System.out.println(" multiple words ");
  } else {
      System.out.println("single words");
  }
    }
}
