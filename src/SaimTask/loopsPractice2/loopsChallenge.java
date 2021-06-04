package SaimTask.loopsPractice2;
import java.util.*;
public class loopsChallenge {
    public static void main(String[] args) {
        Random murtuz = new Random();
        String random = "";
        for (int i = 0; i<6; i++){
            int ran = murtuz.nextInt(6);
            if(!random.contains(ran + "")){
                random += ran;
            }else {
                i--;
            }

        }
        System.out.print(random);

    }
}
