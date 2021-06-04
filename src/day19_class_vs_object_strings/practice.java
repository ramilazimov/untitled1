package day19_class_vs_object_strings;

public class practice {
    public static void main(String[] args) {
        String city = "Baku";
        System.out.println(city.equals("baku"));
        System.out.println(city.equals("Baku"));
        System.out.println(city.equalsIgnoreCase("bAkU "));
        System.out.println(city.toLowerCase());
        System.out.println(city.toUpperCase());
    }
}
