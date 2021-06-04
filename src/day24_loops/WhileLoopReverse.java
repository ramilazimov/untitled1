package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
        byte count = 5;
        while (count > 0){
            System.out.println("count = " + --count);

        }
        System.out.println("finished the count");

        int unreadSMS = 10;
        while(unreadSMS >0){
            System.out.println("I have total  " + --unreadSMS + " unread SMS" );
        }
        System.out.println("no more unread SMS messages");
    }
}
