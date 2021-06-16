package day54_abstraction;

public class Salad extends MenuItem{
    @Override
    public void prepare() {
        System.out.println("chop veggies");
    }

    @Override
    public void serve() {
        System.out.println("put into bowl");
    }
}
