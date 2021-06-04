package day39_Wrapper_Classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
//        System.out.println(Integer.max(10,5));
//        System.out.println(Integer.sum(50,35));
//        System.out.println(Integer.min(5,2));
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//
//        System.out.println(Double.max(234.6,456.6));
//        System.out.println("MIN Double " + Double.MIN_VALUE);
//        System.out.println("MAX Double " + Double.MAX_VALUE);
//
//        System.out.println(Double.compare(5,1));
//        System.out.println(Double.compare(5,5));
//        System.out.println(Double.compare(5,41));
//
//        System.out.println(Character.isDigit('8'));
//        System.out.println(Character.isDigit('v'));
//        System.out.println(Character.isAlphabetic('Q'));
//        System.out.println(Character.isLetter('R'));
//        System.out.println(Character.isLetter('8'));

        char letter = 'A';
        if(Character.isUpperCase(letter)){
            System.out.println(" its uppercase");
        }
        String word  =" Java is Fun ";
        for(int i = 0;i < word.length();i++){
            if(Character.isLowerCase(word.charAt(i))){
                System.out.print(word.charAt(i) + " ");
            }
        }
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
    }
}
