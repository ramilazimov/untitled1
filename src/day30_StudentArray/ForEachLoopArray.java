package day30_StudentArray;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] data = {32,456,567,345,567,89,908,452};
        for(int eachNUm : data){
            //System.out.print(eachNUm + " ");
        }

             for( int n : data){
                 //System.out.print(n + " ");
             }
             for(int i = 0; i < data.length;i++){
                 System.out.print(data[i] + " ");
                 //System.out.println(data[data.length - 1]);

             }
        }
    }

