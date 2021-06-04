package day46_Encapsulation;

public class NewCarObject {
    public static void main(String[] args) {

        NewCar car1 = new NewCar();
        car1.model = "Nissan Altima";
        car1.setModel("Mercedes Benz");
        System.out.println("Car model "+car1.getModel());

        car1.setYear(2020);
        System.out.println("Car year is "+ car1.getYear());

        car1.setMileage(14333);
        System.out.println("Car mileage is "+car1.getMileage());
        car1.setMileage(45777);
        System.out.println("car1 mileAge " +  car1.getMileage());
        System.out.println(car1.toString());
        NewCar alfaRomeo = new NewCar();
        alfaRomeo.setModel("Alfa Romeo");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(17000);
        System.out.println(alfaRomeo);
    }
}
