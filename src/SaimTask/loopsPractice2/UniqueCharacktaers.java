package SaimTask.loopsPractice2;

public class UniqueCharacktaers {
    public static void main(String[] args) {
        String str = "AAABBBCCDEEF";
        String unique = "";
        for (int i = 0; i< str.length()-1;i++){
            if(str.charAt(i) != str.charAt(i+1)){
                unique += str.charAt(i);
            }
        }
        System.out.println(unique);
    }
}
