package SaimTask.Array2;

public class AndreySum67 {
    public static void main(String[] args) {

    }
    public int sum67(int[] nums){
        boolean inTheZone = false;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 6 && !inTheZone) {
                sum += nums[i];
            } else if (nums[i] == 6) {
                inTheZone = true;
            }
            if (nums[i] == 7) {
                inTheZone = false;
            }

        }

        return sum;
    }
}
