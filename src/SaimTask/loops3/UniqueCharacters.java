package SaimTask.loops3;

public class UniqueCharacters {
    public static void main(String[] args) {
        String word = "AAABCCDEEF";
        String uniqueLetters = "";
        for (int i = 0; i < word.length()-1;i++){
                  int count = 0;
                  boolean unique = true;
            if(word.charAt(i) == word.charAt(i+1)){
                unique = false;

            }
            if(true){
                uniqueLetters += word.charAt(i+1);
            }


        }
        System.out.println(uniqueLetters);
    }
}
