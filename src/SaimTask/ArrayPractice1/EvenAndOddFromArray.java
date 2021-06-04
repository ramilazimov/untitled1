package SaimTask.ArrayPractice1;

public class EvenAndOddFromArray {
    public static void main(String[] args) {
        int[] num = {4,1,3,12,5,9};
        int countEven= 0;
        int countOdd = 0;
        for (int each: num){
            if(each % 2 == 0){
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println(" even number - " + countEven);
        System.out.println("Odd numbers - " + countOdd);
    }
}
