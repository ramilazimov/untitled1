package day27_loops;

public class PracticeIndexOf {
    public static void main(String[] args) {
        String word = "Ramil Azimovmmm";
        char letter = 'm';
        int index = -1;
        for (int i = 0;i < word.length()-1;i++){
            if(word.charAt(i) == letter){
                index = i;
                System.out.println(letter + " is found at " + index);

            }

        }
    }
}
