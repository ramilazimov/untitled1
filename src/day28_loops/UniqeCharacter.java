package day28_loops;

public class UniqeCharacter {
    public static void main(String[] args) {
//        String word = "helloworld";
//        String uniqueChars = "";
//        int number1 = 1;
//        for(int i = 1; i < word.length();i++){
//            if( number1 < 2) {
//                uniqueChars += word.charAt(i);
//                System.out.println(uniqueChars);
//            }
//
//        }
       // System.out.println(uniqueChars);
//        String word = "javva";
//        String unique = "";
//        for(int i = 0;i < word.length(); i++){
//            if(!unique.contains(word.charAt(i) + ""));
//            unique += word.charAt(i);
//        }
//        System.out.println(unique);
        String word = "javva";
        String unique = "";
        word.charAt(2);

        for(int i = 0; i < word.length(); i++) {
            //if word.charAt(i) is not contains in unique
            //add to unique
            if(!unique.contains(word.charAt(i)+"")) {
                unique += word.charAt(i);
            }
        }

        System.out.println(unique);
    }
}
//

