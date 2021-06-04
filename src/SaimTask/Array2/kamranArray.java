package SaimTask.Array2;

import java.util.Arrays;

public class kamranArray {
    public static void main(String[] args) {
        int sizeCounter = 0;
        int[] arrEven = new int[0];
        for (int each : arrEven) {
            if (each % 2 == 0) {
                sizeCounter++;
                arrEven = new int[sizeCounter];
            }
        }
        System.out.println(Arrays.toString(arrEven));
    }
}