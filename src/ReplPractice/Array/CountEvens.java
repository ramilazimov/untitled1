package ReplPractice.Array;

public class CountEvens {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        int count = 0;
        for (int each : nums){
            if(each %2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
