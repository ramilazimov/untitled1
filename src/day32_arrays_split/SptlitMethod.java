package day32_arrays_split;
import java.util.*;
public class SptlitMethod {
    public static void main(String[] args) {
        String words = "java , python , selenium , html";
        String[] wordsArray = words.split(" , ");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array = " + wordsArray.length);
        for( String each : wordsArray){
            System.out.println(each);
        }
        String sentence = "today I am coding java arrays";
       String[] senArrays = sentence.split(sentence);
        System.out.println(Arrays.toString(senArrays));
        System.out.println("number of word " + senArrays.length);

         for(String each : senArrays){
             System.out.println(senArrays);
         }
         }


    }

