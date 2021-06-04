package day25_loops;

public class loopFizzBuzz {
    public static void main(String[] args) {
//        int num = 0;
//        for(int n = 0; n <= 100; n++){
//            if(num % 3 == 0 && num % 5 ==0){
//                System.out.println("FizzBuzz" + num);
//            } else if(num % 3 != 0){
//                System.out.println(" Fizz" + num);
//            } else {
//                System.out.println("Buzz" + num );
//            }
//        }
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBazz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
