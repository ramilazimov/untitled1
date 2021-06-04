package SaimTask.ArrayPractice1;

public class ShortestLongestString {
    public static void main(String[] args) {
        String[] word = {"java", "python" ,"javascript", "selenium"};
        String max = word[0];
        String min = word[0];

        for(int i =0;i< word.length;i++){

            if(word[i].length()>max.length()){
                max = word[i];
            }
            if(word[i].length() < min.length()){
                min = word[i];
            }

            }
        System.out.println(max);
        System.out.println(min);

            }

        }


