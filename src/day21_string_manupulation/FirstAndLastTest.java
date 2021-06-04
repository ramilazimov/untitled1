package day21_string_manupulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "mom";
        char first = word.charAt(0);
        char last = word.charAt(2);
        if(first == last){
            System.out.println(word + " word is palindrome");
        } else {
            System.out.println("first and last letters not the same");
        }
        if(word.charAt(0) == word.charAt(2)){
            System.out.println("match");
        } else {
            System.out.println("not match");
        }
        String friend = "i";
        char firstLetter = friend.charAt(0);

        //char lastLetter = friend.charAt(friend.length() - 1);
        int count = friend.length();
        char lastLetter = friend.charAt(count - 1);

        System.out.println(firstLetter);
        System.out.println(lastLetter);
        if(firstLetter == lastLetter){
            System.out.println(friend + " - first and last match");
        } else {
            System.out.println(" no match");

            String word1 = "java";
            System.out.println(word1.indexOf("v"));

        }
    }
}
