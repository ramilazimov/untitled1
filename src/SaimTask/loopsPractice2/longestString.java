package SaimTask.loopsPractice2;

public class longestString {
    public static void main(String[] args) {
        String word = "aaabbbcccccddddee";
        String result = "";
        String resultContainer = "";


        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    result += word.charAt(i);
                } else {
                    if (result.length() > resultContainer.length()) {
                        resultContainer = result;
                        result = "";
                    } else {
                        result = "";
                    }
                }

            }

        }
        System.out.println(resultContainer );
    }
}




