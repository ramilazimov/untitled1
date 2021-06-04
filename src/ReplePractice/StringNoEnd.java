package ReplePractice;

public class StringNoEnd {
    public static void main(String[] args) {
       String email= "craig_federighi@apple.com";
        System.out.println(email.substring(email.indexOf("_")+1,email.indexOf("@")));
    }
}
