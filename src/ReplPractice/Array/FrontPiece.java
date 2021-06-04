package ReplPractice.Array;
import java.util.Arrays;
import java.util.Scanner;
public class FrontPiece {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int size = scan.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter numbers according to size");
            num[i] = scan.nextInt();

        }
        if (size < 2) {
            int[] nums = new int[1];

            for (int i = 0, n = 0; i < 1; i++) {
                nums[n++] = num[i];
            }
            System.out.println(Arrays.toString(nums));

                }
        if (size >= 2) {
            int[] nums1 = new int[2];
            for (int i = 0, n = 0; i < 2; i++) {
                nums1[n++] = num[i];


            }



            System.out.println(Arrays.toString(nums1));
        }





    }
}





