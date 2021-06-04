package ReplPractice.methods;

public class practiceTwoContainerArray {
    public static void main(String[] args) {
        String str = "jh3j4";
        char [] strArr = str.toCharArray();
        String letter = "";
        String digits = "";
        String result ="";
        for(Character each:strArr){
            if(Character.isLetter(each)){
                letter +=each + " ";       //jh3j4
            }else {
                digits += each + " ";
            }
        }
        for(int i = 0,j=0,c=0;i<str.length();i++){

            if(Character.isLetter(str.charAt(i))){

                result +=letter.charAt(j);
                j++;
            } else{

                result +=digits.charAt(c);
                c++;
            }
        }
        System.out.println(result);
    }
}
