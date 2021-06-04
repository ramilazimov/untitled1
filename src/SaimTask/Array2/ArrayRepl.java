package SaimTask.Array2;

public class ArrayRepl {
    public static void main(String[] args) {
        int num1[] = {5, 1, 5, 8, 778, 56, 3};
        int num2 [] = {1,5,3,76,12,45};

        for(int i = 0;i < num1.length;i++){
            for(int j = 0;j < num2.length;j++){
                if(num1[i] == num2[j] ){
                    System.out.println(num1[i]);
                }

            }
        }
    }
}
