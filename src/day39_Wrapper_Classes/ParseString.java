package day39_Wrapper_Classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "123";
        int count  = Integer.parseInt(total);
        System.out.println("count - " + count);

        String strPrice = "103.7";
        double price = Double.parseDouble(strPrice);
        if(price > 100){
            System.out.println("expensive");
        }
        String sentence = "I wrote 857 lines of code";
       String[] array = sentence.split(" ");
       int linesOfCode = Integer.parseInt(array[2]);

       //int linesOfCode = Integer.parseInt(array[2]);
        System.out.println("linescodes - " + linesOfCode);

//        String sentence = "I wrote 100 lines of code";
//        //split by space, parse index 2 to int
//        String[] words = sentence.split(" ");
//        int linesOfCode = Integer.parseInt(words[2]);
//        System.out.println("linesOfCode = " + linesOfCode);


    }
}
