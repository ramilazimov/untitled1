package day35_methods_with_param;

public class MethodWithParametrs {
    public static void main(String[] args) {
        dislayValue(7);
        dislayValue(77);
        dislayValue(777);
        int count = 77;
        dislayValue(count);
        greetByName("Ramil");
        greetByName("Nadir");

    }
    public static void dislayValue(int num){
        System.out.println("value is " + num);

    }
    public static void greetByName(String name){

        System.out.println("Hello " + name + " , how are you today?");
    }
}
