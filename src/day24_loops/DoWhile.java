package day24_loops;

public class DoWhile {
    public static void main(String[] args) {
//        int number  = 1;
//        do {
//            System.out.print("  " + number);
//            number++;
//
//        } while (number <= 77);
        int counter = 0;
        do {
            System.out.println("counter  = " + counter);
            counter += 100;
        }
        while (counter <= 1000);


    }

}
