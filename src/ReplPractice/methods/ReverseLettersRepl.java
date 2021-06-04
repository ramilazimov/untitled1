package ReplPractice.methods;

public class ReverseLettersRepl {
    public static void main(String[] args) {
        String str = "a,b$c";
        String result = "";
        int indexNumber = 0;
        String letters = "";
        String symbols = "";
        String letterIndex ="";

        String reverseLetters ="";
       String[]splitLetters = str.split("");
       char[]chars = str.toCharArray();

        for(int i = 0;i < chars.length;i++){

            if(chars[i]>=65 && chars[i]<=90 ||
                    chars[i]>=97 && chars[i]<=122){
                letters += chars[i];
                letterIndex += i;

            }else{
                symbols +=chars[i];
            }
        }
        for(int i = letters.length()-1;i >=0 ;i--){
            reverseLetters +=letters.charAt(i);
        }

//         for(int i =0,j=0;i < symbols.length();i++,j++){
//             result += reverseLetters.charAt(i);
//             result += symbols.charAt(j);
//         }
//        System.out.println(result);

        System.out.println(reverseLetters + " " + letterIndex);
    }
}
