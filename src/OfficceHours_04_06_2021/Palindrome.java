package OfficceHours_04_06_2021;

public class Palindrome {
    public static void main(String[] args) {
        String word = "civic";
        boolean isPalindrome = true;
        // Q: What if your String has a million characters

        for(int i=0; i < word.length()/2; i++) {

            if(word.charAt(i) != word.charAt(word.length()-1-i)) {
                //System.out.println(word);
                isPalindrome = false;
                break;
            } else {
                System.out.println(word);
            }
        }
       // System.out.println(isPalindrome);

    }
}
