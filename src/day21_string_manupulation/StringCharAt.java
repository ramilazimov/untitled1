package day21_string_manupulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "ramil";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));
        System.out.println(word + "-" + word.length());
        String company = "Cybertek";
        System.out.println("first letter: " + company.charAt(0));
        char first = company.charAt(0);
        System.out.println(first);
        char second = company.charAt(1);
        char third = company.charAt(2);
        char four = company.charAt(3);
        char fifth = company.charAt(4);
        char sixth = company.charAt(5);
        char seventh = company.charAt(6);
        char eighths = company.charAt(7);
        System.out.println("name -" + first +"" + second +"" + third +"" + four + "" +fifth + "" +sixth +"" + seventh+"" +eighths );
         String withSpaces = first +"" + second +"" + third +"" + four + "" +fifth + "" +sixth +"" + seventh+"" +eighths;
        System.out.println(" withSpaces = " + withSpaces);


    }


}
