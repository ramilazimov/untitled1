package day16_swtch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
          String size = "grande";
          double price = 3.69;
          int calories = 90;
          switch (size){
              case "tall":
                  System.out.println("Tall Cappuccino please");
                  price = 3.69;
                  calories = 90;

                  break;
              case "grande":
                  System.out.println("Grande Cappuccino please");

                  price = 3.99;
                  calories = 120;
                  break;

              case "venti":
                  System.out.println("Venti Cappuccino please");

                  price = 4.29;
                  calories = 150;
                  break;
              default:
                  System.out.println("we dont have bigger size");
                  break;

          }
        System.out.println("Total price: $" + price);
        System.out.println("You will consume "+ calories +" cals of energy");



    }
}
