package ReplPractice.Array;

public class ReverseArrayCustomMethod {
    public static void main(String[] args) {
        System.out.println(reverse("something"));
    }
    public static String reverse(String input){
        String result = "";
        for (int i = input.length()-1; i >= 0; i--) {
            result += input.charAt(i);
        }
        return result;
    }

}
