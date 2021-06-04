package ReplPractice.methods;

public class ReverseLetters {
    public static void main(String[] args) {
        String str = "a,b$c";

        for(int i = 0;i < str.length();i--){
            if(str.charAt(i) > 97 && str.charAt(i) < 122){
                System.out.println(str);
            }
        }
    }
}
