package day53_Inheritance;

public class ModelX extends ElectricCar1{

  public ModelX(String make, String model, double price, int year, int range){
     super( make,  model,  price,  year,  range);
  }
    /**
     ERROR below , because charge is final method. cannot be overridden
     */
//    public void charge() {
//
//    }
}

