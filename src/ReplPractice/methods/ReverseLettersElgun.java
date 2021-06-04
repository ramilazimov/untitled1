package ReplPractice.methods;

public class ReverseLettersElgun {
    public static void main(String[] args) {
        String str = "A,%&Bc<*K";
        int length = str.length()-1;
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){

                for (int j = length; j >=0 ; j--) {

                    if(Character.isLetter(str.charAt(j))){
                        result+=str.charAt(j);
                        length = j-1;
                        break;
                    }
                }
            }else{
                result+=str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
