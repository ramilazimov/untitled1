package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
//      char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
//       for( char i : letters){
//          System.out.print(i + " ");
//        }
////// CONVERT CHAR ARRAY TO STRING
//     String letterStr = new String(letters);
//        System.out.println(letterStr);
//
//        // CONVERT STRING INTO CHAR ARRAY
//      String name = "Ramil";
//     char[] charName = name.toCharArray();
//        String fruitStr = "";
//        String[] fruits = {"bananas" , "apples", "kiwi", "mango", "papaya", "strawberry" };
//        for(String frt : fruits){
//            System.out.print(frt + " - ");
//            fruitStr +=frt + " - ";
//        }
//        System.out.println("================n=========================");
//        System.out.println(fruitStr);

        String[] languages = {"java" , "pyhton" , "c++" , "ruby" ,  };
        System.out.println(String.join(" ++ ",languages));
        System.out.println(String.join(" && ",languages));
        String joinedLanguages = String.join(" <> " , languages);
        System.out.println(String.join(" <> " , languages));

        // Arrays utility class has usefull methods
        //1) sort(array) method:

    }
}
