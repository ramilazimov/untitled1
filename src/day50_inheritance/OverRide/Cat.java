package day50_inheritance.OverRide;

public class Cat extends Animal1{
    public void  jump(){
        System.out.println(" cat is jumping");
    }
    @Override
    public  void speak(){
        System.out.println(" cat is saying meow");
    }
}
