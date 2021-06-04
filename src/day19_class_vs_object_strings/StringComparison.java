
package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";
        System.out.println(city.equals("Chicago"));//true
        System.out.println(city.equals("chicago"));
        System.out.println(city.equals("Chicago "));
        System.out.println(city.equals("chicago  "));
        // EqualsIgnoreCase
        System.out.println(city.equalsIgnoreCase("Chicago"));
        System.out.println(city.equalsIgnoreCase("CHICAGO"));
        System.out.println(city.equalsIgnoreCase("cHIcAGO"));
        System.out.println(city.equalsIgnoreCase("Chiicago"));
        System.out.println(city.equalsIgnoreCase("Chi ca go"));
        System.out.println(city.equalsIgnoreCase("ChIcAgo"));
        if(city.equals("Chiacgo")){
            System.out.println("equals () true");
        } else {
            System.out.println("equal () false");
        }
        if(city.equalsIgnoreCase("ChiCago")){
            System.out.println("true");
        } else {
            System.out.println("false");
            System.out.println(city.equalsIgnoreCase("Ch_cago"));
        }


    }
}
