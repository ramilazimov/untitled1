package day22_String_manipulation;
import java.util.*;
public class Length {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "aabbaa";
        String unicode = "";
        int count = 0;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!unicode.contains(str.charAt(i) + "")) {
                unicode += str.charAt(i);

            }
            System.out.println("unicode = " + unicode);
        }

    }
}
