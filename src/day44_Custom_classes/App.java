package day44_Custom_classes;

public class App {
    String name;
    Double version;
    public void open(){
        System.out.println( name + " " + version);
    }
    public void playing(String person){
        System.out.println(person + " buying new  " + name + version);

    }
}
