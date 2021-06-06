package day50_inheritance.OverRide;

public class Dog extends Animal1{
    public void run(){
        System.out.println("Dog is running");
    }
    @Override
    public  void speak(){
        System.out.println(" dog is saying gav-gav");
    }
}
