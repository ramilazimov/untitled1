package SaimTask.loopsPractice2;

public class BiggestSubstring {
    public static void main(String[] args) {
        String word = "aaabbbcccccddddee";
        String num = "";
        String max = "";

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if(word.charAt(i) == word.charAt(j)){
                    num += word.charAt(i);
                } else {
                    if(num.length() > max.length()){
                        max =num  ;
                       num = "";
                    }else {
                        num = "";
                    }
                }
            }

        }
        System.out.println(max);
    }
}
