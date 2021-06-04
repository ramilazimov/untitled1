package day25_loops;

public class CountChars {
    public static void main(String[] args) {
        String word = "java";
        char letter = 'a';
        int count = 0;
        for(int i = 0; count <= word.length(); i++){
            if(word.charAt(i)== letter){
               count++;
            }
            }
        System.out.println(" There is " + count + " " + letter + " 's in " + word);
    }

    }

