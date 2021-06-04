package day29_nestedloop_arrays;

public class StringNested2 {
    public static void main(String[] args) {
        String word = "eeerrrtttyyyyyy";

        String container = "";
        char outerChar = 'a';
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            count = 0;
            outerChar = word.charAt(i);

            for (int j = 0; j < word.length(); j++) {
                char innerChar = word.charAt(j);
                if (outerChar == innerChar) {
                    count++;
                }
            }
            i += count - 1;
            container += "" + outerChar + count;
        }
        System.out.print(container);
    }
}