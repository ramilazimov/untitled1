package InterviewQuestions;

import java.util.Arrays;
import java.util.Random;

public class UNiqueIntegersSumUpTO_0 {
    public static void main(String[] args) {

               int count = 0;
               int N = 10;
               int sum = 0;
               int[] result = new int[N];
            for (int i = 0; i < N - 1; i++) {
                count = 0;
                Random rand = new Random();
                result[i] = rand.nextInt(80);
                sum += result[i];
                result[N - 1] = -sum;
            }
            for (int j = 0; j < N; j++) {
                //count = 0;
                for (int a = 0; a < N; a++) {
                    if (result[j] == result[a]) {
                        count++;
                    }
                }
            }
            if (count <= N ) {
                System.out.println(Arrays.toString(result));

            }

        }
    }







