package day27_loops;

public class PrReadStringPortion {
    public static void main(String[] args) {
        String name = "Ramil Azimov";
        for (int i = 0; i <= name.length()-2; i++) {
            System.out.println(name.substring(i,i+2));
            if (name.substring(i,i+2).equalsIgnoreCase("ra") || name.substring(i,i+2).equalsIgnoreCase("az")) {
                System.out.println(" ra or az found ");
            }
        }
    }
}