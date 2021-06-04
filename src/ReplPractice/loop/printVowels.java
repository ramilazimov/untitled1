package ReplPractice.loop;

public class printVowels {
    public static void main(String[] args) {
        String word = "howdyho";

        for(int i = 0; i<=word.length();i++){
            if(word.charAt(i) == 'u' || word.charAt(i) == 'e' ||word.charAt(i) == 'o'|| word.charAt(i) == 'i'
                    || word.charAt(i) =='a' || word.charAt(i) == 'e'){
                System.out.print(word.charAt(i));

            }
        }

    }

}
