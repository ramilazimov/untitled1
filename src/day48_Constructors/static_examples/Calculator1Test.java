package day48_Constructors.static_examples;

public class Calculator1Test {
    public static void main(String[] args) {
        //add is static method, can be called using Classname.staticMethodName
        //static way of calling the method
        Calculator1.add(5, 3);

        //Calculator.multiply(2, 4); ERROR: multiply is not static. need object to call it
        //multiply is instance method, and we are creating object then calling it
        Calculator1 calcObject = new Calculator1();
        calcObject.multiply(2, 4);

        //static method can also be called using an object
        calcObject.add(10, 45);
    }
    }


