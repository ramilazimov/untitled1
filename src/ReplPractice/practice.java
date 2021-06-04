package ReplPractice;

public class practice {
    public static void main(String[] args) {
        String word = "catdogcat";
        int catNum = 0;
        int c = 0;
        int doqNum = 0;
        int d = 0;
        for (int i = 0; i <= word.length() - 3; i++) {
            if (word.substring(i, i + 3).equals("cat")) {
                catNum+=1;
                System.out.println(catNum);
//
//                c = catNum++;
//            }
//           else if(word.substring(i, i + 2).equals("doq")){
//                d = doqNum++;
//            }
//             else if(c == d){
//                System.out.println(true);
//                return;
//            }
            }
        }
    }

}