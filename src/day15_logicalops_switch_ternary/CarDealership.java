package day15_logicalops_switch_ternary;

public class CarDealership {
    public static void main(String[] args) {
        double budget = 5000.00;
        String model = "Tesla";
        double carPrice = 8977.00;
       if(budget >= carPrice && (model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla"))){
           System.out.println("ready to purchase model = " + model + " , price = " + carPrice);
       } else {
           System.out.println(" NOt interested for model = " + model + " , price " + carPrice);
       }

    }
}
// if(budget >= carPrice && model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla"))
// true && (false || false || true )- true that's why its its true