package day45_OOP;

public class CoffeeObjects {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());

        //refill my coffee by calling the refill method
        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.getAmount());

        myCoffee.drink(10);
        System.out.println("amount after drink 10 = " + myCoffee.getAmount());

        // myCoffee.type = "turkish coffee"; not this way, we have tu use method
        myCoffee.setType("turkish coffee");
        System.out.println("my coffee = " + myCoffee.getType());

        //describe my coffee
        System.out.println(myCoffee.toString());
        System.out.println("----------");

        //add another coffee object, set values, call methods
        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");

        //assign coffee1 object to coffee2
        ////hey java, point coffee2 to same object as coffee1
        Coffee coffee2 = coffee1;
        System.out.println("coffee2 type = "+ coffee2.getType());
        System.out.println("----------");
        coffee2.setType("espresso");
        System.out.println("coffee1 type = "+ coffee1.getType());
        System.out.println("coffee2 type = "+ coffee2.getType());
        System.out.println("----------");

        Coffee coffee3 = new Coffee();
        coffee3.setType("frappuccino");
        System.out.println("coffee1 type = "+ coffee1.getType());
        System.out.println("coffee2 type = "+ coffee2.getType());
        System.out.println("coffee3 type = "+ coffee3.getType());
        System.out.println("----------");
        // point to same object as coffee2
        coffee3 = coffee2;
        System.out.println("coffee1 type = "+ coffee1.getType());
        System.out.println("coffee2 type = "+ coffee2.getType());
        System.out.println("coffee3 type = "+ coffee3.getType());

    }
}
