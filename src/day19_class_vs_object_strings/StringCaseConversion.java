package day19_class_vs_object_strings;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "Cybertek";
        String sentence = "JAVA IS FUN";
        System.out.println(word);
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());

        word.toLowerCase();
        System.out.println(word);
        String wordInCase = word.toLowerCase();
        System.out.println("wordInCase = " +  wordInCase);
        //word = word.toLowerCase();
         word = word.toLowerCase();
        System.out.println("word = " + word);

        String company = "amazon";
        System.out.println(company.toUpperCase());
        String city = " baku";
        System.out.println(city.toUpperCase());
        System.out.println(" city in upper case - " +city.toUpperCase());
        System.out.println("baku".toUpperCase());
          company = company.toUpperCase();
        System.out.println("company - " + company);
    }
}
