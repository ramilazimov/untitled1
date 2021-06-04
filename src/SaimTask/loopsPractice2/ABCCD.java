package SaimTask.loopsPractice2;

public class ABCCD {
    public static void main(String[] args) {


    String str = "AABCCD";
    String duplicate = "";
    String unique = "";

    //        for (int i = 0; i < str.length(); i++) {
//            if (!duplicate.contains(str.charAt(i) + "")) {
//                duplicate += str.charAt(i) + ", ";
//            }
//        }
//        System.out.print(duplicate);
//          "AABCCD";
    /// "AABCCD";
    int count =0;
        for (int i = 0; i < str.length(); i++) {
              count=0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(i)==str.charAt(j)){
                count++;
            }
        }
        if (count==1){
            unique+=str.charAt(i);// b
        }
    }
        System.out.println("unique = " + unique);
}
}

