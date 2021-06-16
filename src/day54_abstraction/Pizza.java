package day54_abstraction;

public class Pizza extends MenuItem{

    @Override
    public void prepare() {
        System.out.println("Strech the dough");
    }

    @Override
    public void serve() {
        System.out.println("serve in plate or in a box");
    }
}
