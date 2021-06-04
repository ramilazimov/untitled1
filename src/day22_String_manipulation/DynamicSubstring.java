package day22_String_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";
        //System.out.println(result.substring(12));
        //System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        //System.out.println(result.substring(colonIndex + 1));
        //System.out.println(result.substring(result.indexOf(":")));
        String today = "i learned [wooden spoon] today";
        //System.out.println(today.indexOf("["));
        //System.out.println(today.indexOf("]"));
       System.out.println(today.substring((today.indexOf("s")+1 ),((today.indexOf("]")))));
        int start = today.indexOf("[");
        int end = today.indexOf("]");
        System.out.println(today.substring(today.indexOf(start ,end)));


    }
}
