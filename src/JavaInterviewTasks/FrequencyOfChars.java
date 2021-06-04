package JavaInterviewTasks;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "AAABBCDD";
        String check = "";
        int count = 0;


        for (int i = count; i < str.length(); i++) {
            if (!check.contains("" + str.charAt(i))) {
                check +=str.charAt(i);
            }
                count = 0;
            for(int j = count;j < str.length();j++)

            if(str.charAt(i) == str.charAt(j)){
                count++;
                }

            check +=count;

        }
        System.out.println(check);
                  }
           }


