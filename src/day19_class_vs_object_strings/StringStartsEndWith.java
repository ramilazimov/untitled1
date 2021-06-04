package day19_class_vs_object_strings;

public class StringStartsEndWith {
    public static void main(String[] args) {
        String word = "Ramil";
        System.out.println(word.startsWith("Ram"));
        System.out.println(word.startsWith("R"));
        System.out.println(word.startsWith("amil"));
        System.out.println(word.startsWith("r"));
        System.out.println(word.startsWith("ramil"));

        String word1 = "International";
        System.out.println(word1.startsWith("Int"));
        System.out.println(word1.startsWith("Intern"));


        System.out.println(word1.endsWith("al"));
        System.out.println(word1.startsWith("inter"));
        System.out.println(word1.endsWith("nal"));

        String name = "Ms.";
        if(name.startsWith("Mr.")){
            System.out.println(" mister");
        }else if(name.startsWith("Dr.")){
            System.out.println("doctor");
        } else if(name.startsWith("Mrs.")){
            System.out.println("Messes");
        } else if(name.startsWith("Sr.")){
            System.out.println("senior");
        } else if(name.startsWith("OMG")){
            System.out.println(" OH MY GOd");
        } else if(name.startsWith("Sr.")){
            System.out.println("sir");
        }

     String url = ".com";
        if(url.endsWith(".ru")){
            System.out.println("russia");
        } else if (url.endsWith(".gov")){
            System.out.println(" government");
        } else if(url.endsWith(".edu")){
            System.out.println("education");
        } else if(url.endsWith(".com")){
            System.out.println("commercial");
        } else if(url.endsWith(".az")){

        }


    }
}
