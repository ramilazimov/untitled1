package day56_abstraction;

public class Tesla extends Transportation{
    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people");
    }

    @Override
    public void cost(int mile) {

    }
}
