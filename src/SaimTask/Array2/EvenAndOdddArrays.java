package SaimTask.Array2;

import java.util.Arrays;

public class EvenAndOdddArrays {
    public static void main(String[] args) {
        int[] number = {1,2,-3,4,-34,55,78,90,33,10};
        String even = "";
        for(int i = 0; i < number.length; i++){
            if(number[i] % 2 == 0){
                even += number[i] + " ";
            }
        }
        String[] evenArray = even.split(" ");
        System.out.println(Arrays.toString(evenArray));

    }
}
