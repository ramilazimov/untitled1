package SaimTask.loopsPractice2;

public class SonuncuHerfiCapEt {
    public static void main(String[] args) {
        String word = "ghjgjh";
         String unique = "";
         for (int i = 0;i<word.length();i++)
        if(word.charAt(i+1) > word.length()-1){
              unique += word.charAt(i);
              break;
        }
        System.out.println(unique );
    }
}
