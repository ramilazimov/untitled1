package ReplPractice.loop;

public class CountJava {
    public static void main(String[] args) {
        String word = "javaxjavajav";
        int numberOfTimes = 0;
        for(int i = 0; i<=word.length()-4;i++){
            if(word.substring(i,i+4).equals("java")){
                numberOfTimes++;
            }

        }
        System.out.println(numberOfTimes);
    }
}
