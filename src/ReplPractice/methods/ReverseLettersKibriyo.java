package ReplPractice.methods;

public class ReverseLettersKibriyo {
    public static void main(String[] args) {
        String str = "Ab,c,de!$";
        char [] strArr = str.toCharArray();
        String letter = "";
        for(char each : strArr){
            if(Character.isLetter(each)){
                letter += each+""; } }
        String reverseStr = "";
        for(int i = letter.length()-1; i >= 0; i--){
            reverseStr += letter.charAt(i); }
        String result = "";
        for(int i = 0, j=0;i < str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                result += reverseStr.charAt(j);
                j++;
            }else{
                result += str.charAt(i);
            }
        }


    }
}
