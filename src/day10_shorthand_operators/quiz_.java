package day10_shorthand_operators;

public class quiz_ {
    public static void main(String[] args){
        int num1 = 50;
        int num2 = 200;
        num2 = num1;
        System.out.println(num1);
        System.out.println(num2);

       // int i = 100;
        //double d = 123;
        //  float f = 300;
        //i = f;
        //f =i;
        //d= f;
       // f=d;
       // d=i;
       // i =d;

        // float a = 100.987_6543f;
        //short b = (byte)a;
        //byte c =(byte)b;
        //System.out.println(c);

        long a = 3_000L;
        double b = (float) a;
        System.out.println(b);

    }

}
