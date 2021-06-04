package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 0;
        while(seconds <=117){
            System.out.println(seconds++ +  "  seconds  1 watching YouTube video  ");
            Thread.sleep(1);
            //Thread.sleep(1000); pause the code execution for a 1000 mksec
        }
        {
            System.out.println("stop watching cat video");
        }
        int count = 5;
        while(count>=0){

            System.out.println(count-- + " count down");
        }
        System.out.println("count down finished");
    }

}
