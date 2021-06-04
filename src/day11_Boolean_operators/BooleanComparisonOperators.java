package day11_Boolean_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10 == 10);
        System.out.println(1000 > 100);
        System.out.println(985.44 < 98654.87);
        System.out.println(10 <= 11);
        System.out.println(5 >= 3);
        System.out.println(-100 != 44);

        int a = 100;
        int b = 200;
        //System.out.println(a == b);//false
        System.out.println(a == b);
       // System.out.println(a > b);//false
        System.out.println(a > b);
        //System.out.println(a < b);//true
        System.out.println(a < b);
       // System.out.println(a >= b);//false
        System.out.println(a >= b);
        //System.out.println(a <= b);//true
        System.out.println(a <= b);
       // System.out.println(a != b);//true
        System.out.println(a != b);

        boolean result = 5 == 5;
        System.out.println("result = " + result);

        result = 33 > 44;
        System.out.println("result = " + result);

        result = 88 < 99;
        System.out.println("result = " + result);

        result = 10 >=10;
        System.out.println("result = " + result);

        result = 123 <= 124;
        System.out.println("result = " + result);

        result = 2!= 2;
        System.out.println("result = " + result);

        String city = "Seattle";
        System.out.println(city == "Seattle");
        System.out.println(city == "Baku");
        System.out.println(city != "Fairfax");

        String name = "Ramil";
        boolean checkName = name == "Ramil";
        System.out.println("checkName = " + checkName);


    }
}
