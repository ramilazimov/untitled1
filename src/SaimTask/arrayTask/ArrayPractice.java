package SaimTask.arrayTask;
public class ArrayPractice {
    public static void main(String[] args) {
        int number [] = {12,45,78,96,54,78,5,56,78,1};
        int max =0;
        int min = number[0];
        for(int i = 0; i<number.length;i++){
            if(number[i]>max){
                max = number[i];
                }
            if(number[i]<min){
                min = number[i];
            }
            }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        }
        //System.out.println("min = " + min);
    }

