package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
//        System.out.println(" even numbers 0 - 100: ");
//        int evenNum = 0;
//        int oddNUm = 0;
//
//        for(int i = 0; i <= 100; i++) {
//            evenNum  +=2;                           this code is wrong
//            oddNUm +=1;
//        }
//        System.out.println("evenNum is " + evenNum );
//        System.out.println("oddnum is " + oddNUm);

        for(int n = 1; n <= 100; n++){
            if(n % 2 == 0){
                System.out.print(n + "");
            }
        }
        System.out.println("\n odd numbers 0 - 100: ");
        for(int k = 0; k <= 100; k++){
            if(k % 2 != 0){
                System.out.print(k + " ");
            }
        }
    }

}
