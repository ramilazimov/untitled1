package HomeTasks;

public class Apartment {
    public static void main(String[] args){
        String address = "2203 west street";
        String nameOfOwner = "Ramil";
        int numberOfUnits = 256;
        int monthlyRentAmount = 2500;
        boolean allowsPetsOrNot = true;
        byte lengthOfLease = 6;
        short totalResidents = 677;
        char numberOfReviewStars = '4';
        short parkingSpots = 500;
        int monthlyRentAfter3 = 10 * monthlyRentAmount/100;
        int monthlyRentAfter6 = 20 * monthlyRentAmount/100;
        int averageNumberOfParkingSpots = totalResidents / numberOfUnits;
        System.out.print("Apartment located in " + address + ".");
        System.out.println(" Apartment has " + numberOfUnits + " units." );
        System.out.println("Monthly rent amount is " + "$" + monthlyRentAmount + "." );



    }


}
