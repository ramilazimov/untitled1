package Codingbat;

public class StringSplosion {
    public static void main(String[] args) {
        String result = "";
        String str ="Code";
        for(int i = 0;i<str.length();i++){
            result +=str.substring(0,i+1);

        }
        System.out.println(result);

    }


}
