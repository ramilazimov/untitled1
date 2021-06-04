package SaimTask.ArrayPractice1;

public class Number100Array {
    public static void main(String[] args) {
       int[] num = {4,5,3,9,6,4,0,8,1};
        int max = 0;
        int min = num[0];
       for (int i = 0;i<num.length;i++){

          // System.out.print(num[i] + " ");
           if(num[i]>max){
               max = num[i];
           }
           if(num[i]<min){
               min = num[i];
           }

       }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
