package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "wooden spoon";
        if(onSale && freeShipping){
            System.out.println("Adding to cart " + itemName);

        }  else {
            System.out.println("continue shopping for good deals on - " + itemName);
        }

        if(onSale && freeShipping && itemName.equals("wooden spoon")){
            System.out.println("adding to cart " + itemName);
        } else {
            System.out.println("Continue shopping for good deals on - " + itemName);
        }
        // location. salary, benefits, remote

    }

}
