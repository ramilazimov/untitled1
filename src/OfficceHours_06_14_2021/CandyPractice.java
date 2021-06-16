package OfficceHours_06_14_2021;

public class CandyPractice {
    private String brand;
    private int quantity;
    private boolean hasPeanuts;
   private static int numberOfTotalCandy;

    public CandyPractice(String brand, int quantity, boolean hasPeanuts) {
        this.brand = brand;
        this.quantity = quantity;
        this.hasPeanuts = hasPeanuts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
      if(quantity > 0){
          this.quantity = quantity;
      }

    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public static int getNumberOfTotalCandy() {
        return numberOfTotalCandy;
    }

    public static void setNumberOfTotalCandy(int numberOfTotalCandy) {
        CandyPractice.numberOfTotalCandy = numberOfTotalCandy;
    }

    @Override
    public String toString() {
        return "CandyPractice{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
