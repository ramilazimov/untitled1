package ReplePractice.OOP;

public class Attributes {
    String name;
    String color;
    int amount;
public String asString(){
    return "name: " + name + "color: " + color + "amount: " + amount;
}

    public static void main(String[] args) {
        Attributes table = new Attributes();
        table.name = "table ";
        table.color = "brown ";
        table.amount = 7;
        System.out.println(table.asString());
    }

}
