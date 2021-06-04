package ReplePractice.OOP;

public class LameCalculator {
    int a;
    int b;

    public int plus(int a, int b){
       this.a = a;
       this.b = b;
       return a + b;
    }
    public int minus(int a, int b){
       this.a = a;
       this.b = b;
       return a - b;
    }
    public int multiply(int a, int b){
       this.a = a;
       this.b = b;
       return a * b;
    }public int divide(int a, int b){
       this.a = a;
       this.b = b;
       return a / b;
    }

    public static void main(String[] args) {
        LameCalculator calculator = new LameCalculator();
        //calculator.plus(7,5);
        System.out.println(calculator.plus(7,5));
        //calculator.minus(7,5);
        System.out.println(calculator.minus(7,5));
    }

}
