package Practice_03_03_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseLettersPractice {
    public static void main(String[] args) {
    String str = "a,b$c";
    String letters = "";
        for(int i = 0; i < str.length();i++){
            if(Character.isLetter(i)){
                letters +=str.charAt(i);
            }
        }
        System.out.println(letters);

    }
}
