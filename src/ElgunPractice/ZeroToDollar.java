package ElgunPractice;

public class ZeroToDollar {
    public static void main(String[] args) {
        String word = "tomorrow";
        String cont = "";

        for (int i = 0, count = 0; i < word.length(); i++) {
            cont += word.charAt(i);
            if (word.charAt(i) == 'o') {
                count++;

                if (count > 1) {

                    cont += 'o';
                    if(count > 2){
                        cont += 'o';
                    }
                }
            }


        }
        System.out.println(cont);
    }
}
