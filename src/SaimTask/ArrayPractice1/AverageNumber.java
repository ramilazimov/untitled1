package SaimTask.ArrayPractice1;

public class AverageNumber {
    public static void main(String[] args) {
        int[] num = {2,3,4,5,};
        double averageNum =0;
        double sum = 0;
        double numLength = num.length;
        for (int i = 0;i< num.length;i++){
              sum += num[i];
            averageNum = sum/num.length;

        }
        System.out.println(averageNum);


    }
}
