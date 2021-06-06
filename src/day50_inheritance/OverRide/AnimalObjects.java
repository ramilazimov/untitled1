package day50_inheritance.OverRide;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal1 animal1 = new Animal1();
        animal1.name = "Gray";
        animal1.type = "Pitbull";
        animal1.speak();

        Cat cat = new Cat();
        cat.speak();
        Dog dog = new Dog();
        dog.speak();

    }
}
