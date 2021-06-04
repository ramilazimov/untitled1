package Codingbat;

public class Yak {
    public static void main(String[] args) {
        System.out.println(removeYak("hiyakhiyokmokyek"));
    }
    public static String removeYak(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='y' && str.charAt(i+2)=='k'){
                    i=i+2;
            } else {
                result +=str.charAt(i);
            }
        }
        return result;
    }
}