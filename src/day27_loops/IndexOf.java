package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'b';
        int index = -1;

//        for(int i=0; i<=word.length()-1;i++){
//
//            if(word.charAt(i)==letter){
//                int index = i;
         for(int n = 0; n < word.length();n++){
             if(word.charAt(n) == letter ){
                 index = n;// we storing n into index for using outside anywhere(if,printing, switch)
                 System.out.println(letter + " is found at " + index);
                 break; // exit for loop
             }
         }
            if(index == -1){
                System.out.println(letter + " is not present");
            }
                //System.out.println("i is found at " + i);
            }
            }


