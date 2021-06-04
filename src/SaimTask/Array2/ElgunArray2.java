package SaimTask.Array2;

public class ElgunArray2 {
    public static void main(String[] args) {
        int number [][] = {{12,45,78},{78,82,89},{63,64,99},{78,96,55}};
        for(int out = 0;out < number.length;out++){
            for(int inner =0;inner<number[out].length;inner++){
                if(number[out][inner] % 2 == 0){
                    System.out.print(number[out][inner] + " ");
                }
            }
        }
    }
}
