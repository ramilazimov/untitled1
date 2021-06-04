package day26_ForLoop;

public class PracticeFindLetterInWord {
    public static void main(String[] args) {
        String name = "Ramil";
        char letter = 'm';
        for(int i = 0; i < name.length();i++){
            if(name.charAt(i) == letter){
                System.out.println(i + " " + letter);
            }
        }
    }
}
