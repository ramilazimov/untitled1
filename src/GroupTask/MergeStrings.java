package GroupTask;

public class MergeStrings {
    public static void main(String[] args) {



    String w1 = "abc", w2 = "defgh"; //adbecfgh
        System.out.println(merge(w1, w2));

}

    public static String merge(String str1, String str2) {

        String merge = "";
        int shortest = 0;
        String longest = "";
        if (str1.length() <= str2.length()) {
            shortest = str1.length();
            longest = str2;
        } else {
            shortest = str2.length();
            longest = str1;
        }
        for (int i = 0; i < shortest; i++) {

            merge += "" + str1.charAt(i) + str2.charAt(i);
        }
        merge = merge + longest.substring(shortest);
        return merge;
    }
}

