package day16_swtch_ternary;

public class Apartments {
    public static void main(String[] args) {
  /*      int numberOfBedrooms = 0;
        double startingPrice = 0;
        switch (numberOfBedrooms){
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("1 bedroom apartment selected");
                startingPrice = 1725;
                break;
            case 2:
                System.out.println("2 bedroom apartment selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println("5 bedroom apartment is not available");
        }


   */
        System.out.println(" welcome to adaire apartments");
        int numberOfBedrooms = 10;
        double startingPrice = 0;
        switch (numberOfBedrooms){
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454.0;
                break;
            case 1:
                System.out.println("one bedroom apartment selected");
                startingPrice = 1454.0;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 1725.0;
                break;
            case 3:
                System.out.println("3 bedroom apartment selected");
            default:
                System.out.println(numberOfBedrooms + " bedroom is not available");
        }

        System.out.println("Starting price : $" + startingPrice);
    }
}
