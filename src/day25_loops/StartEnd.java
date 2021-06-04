package day25_loops;
import  java.util.Scanner;
public class StartEnd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter start number");
        int start = scan.nextInt();

        System.out.println("enter end number");
        int end= scan.nextInt();
        if(start > end){
            System.out.println("reverse numbering is not supported");
        }

        for(int i = start; i < end; i++){
            System.out.print(i + " ");
        }
    }

}
