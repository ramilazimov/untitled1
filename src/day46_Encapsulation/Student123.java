package day46_Encapsulation;

import java.util.Locale;

public class Student123 {
    private String name;
    private int age = 25;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if(name.length()>7){

            name = name.substring(0,1).toUpperCase()+ name.substring(1);
        }else {
            System.out.println("Illegal name");
        }


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
