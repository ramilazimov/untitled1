package day11_Boolean_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        // pre increment ++ (increase by 1)

        int num1 = 10;
        int num2 = ++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //post increment
        int num3 = 8;
    //    int num4 = num3;
    //    num3++;// add 1
        int num4 = num3++;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        int apples = 5;
        int basket = ++apples;
        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int cars = 5;
        System.out.println(++cars);
         int sedans = 10;
        System.out.println(sedans++);// first print 10 then add 1
        System.out.println(sedans); //11

        int a = 50;
        int b = 22; //50 + 23
        int c = a++ + ++b;

        System.out.println("a = " + a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
    }
    }

