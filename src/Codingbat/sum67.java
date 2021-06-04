package Codingbat;

public class sum67 {
    public static void main(String[] args) {
        int sum67 = 0;
        int count6 = 0;
        int count7 = 0;
        int[] sum167 = {1, 2, 2, 6, 99, 99, 7};
        for (int i = 0; i < sum167.length - 1; i++) {
            if (sum167[i] == 6) {
                count6++;
            } else if (sum167[i] == 7) {
                count7++;
            }
            if (count6 >= 1 && count7 == 1 && sum167[i + 1] != 6) {
                if (sum167[i] != 6) {
                    sum67 += sum167[i + 1];
                } else {
                    if (sum167[i] == 6) {
                    }
                }
            }
            if (count6 >= 2 && count7 == 2 && sum167[i + 1] != 6) {
                if (sum167[i] != 6) {
                    sum67 += sum167[i + 1];
                }
            }


        }
        System.out.println(sum67 );
    }

}