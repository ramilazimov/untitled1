package day40_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty = " + shoppingList.isEmpty());
        if(shoppingList.isEmpty()){
            System.out.println("list is empty");
        } else {
            System.out.println("list is not empty");

        }

        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("wooden spoon");
        shoppingList.add("java book");
        shoppingList.add("");


        if(shoppingList.isEmpty()){
            System.out.println("list is empty - " + shoppingList.isEmpty());
        } else {
            System.out.println("list is not empty - " + shoppingList.isEmpty());
    }
        int count = shoppingList.size();

        System.out.println("items to buy = " + count );

        System.out.println("is shoes in my list? - " + shoppingList.contains("shoes"));
        System.out.println(shoppingList);

        shoppingList.remove("shoes");
        shoppingList.remove("wooden spoon");
        System.out.println(shoppingList);
        shoppingList.add("shoes");
        System.out.print(shoppingList);
}

}