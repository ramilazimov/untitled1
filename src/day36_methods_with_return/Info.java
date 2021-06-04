package day36_methods_with_return;
import java.util.*;

public class Info {
    public static void main(String[] args) {
        System.out.println(fullName());
        System.out.println(isMarried());
        System.out.println(getAge());
        System.out.println(getRandomYear());
        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();
        System.out.println("name " + name);
        System.out.println("age " + age);
        System.out.println("year " + year);

    }
    public static String fullName(){
        System.out.println("inside full name");
        return " Mike Smith";
    }

    public static Boolean isMarried(){
        return false;
    }
    public static int getAge(){
        int age = 43;
        return age;
    }
    public static  int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;

    }
}
