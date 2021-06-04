package SublimeTasks;

public class UniqueCharackter {
    public static void main(String[] args) {


        int count = 0;
        String letters = "aabcdcddgsw";
        String unique = "";
        for (int i = 0; i < letters.length() ; i++) {
           for(int j = 0;j < letters.length();j++){
               if(letters.charAt(j) == letters.charAt(i)){
                   count++;
               }
           }
           if(count < 2){
               unique += letters.charAt(i);
           }
           count =0;


        }
        System.out.println(unique);
    }
}




