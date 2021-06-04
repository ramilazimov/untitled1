package day29_nestedloop_arrays;

public class RowColumn {
    public static void main(String[] args) {
        String word = "Code";
    for(int i = 0; i <=word.length()-1;i++){
        for (int j = 0; j <= i;j++){
            System.out.print(word.charAt(j));
        }
        //System.out.println();

    }
    }
}
