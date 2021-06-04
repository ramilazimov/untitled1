package InterviewQuestions;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
       String str = "AAABBCCCGGAA";
        System.out.println(FrequencyOfChar(str));

    }
    public static String FrequencyOfChar(String str){
      String nonDup = "";
        for (int i = 0; i < str.length(); i++) {
            if(!nonDup.contains("" + str.charAt(i))){
                nonDup += str.charAt(i);
            }
        }
        String expectedResult = "";
        for (int i = 0; i < nonDup.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == nonDup.charAt(i)){
                    count++;
                }
            }
            expectedResult += "" + nonDup.charAt(i) + count;
        }
        return expectedResult;
        }
}
