package day44_Custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {
       Animal animal = new Animal();
        System.out.print(animal.type +  " is " );
         animal.eat(" grass");
         animal.speak();
         Animal cheetaObj = new Animal();
         cheetaObj.type = "cheetah is ";
        System.out.println(cheetaObj.type);
        cheetaObj.eat(" meat");

    }
}
