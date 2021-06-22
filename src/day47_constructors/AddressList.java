package day47_constructors;

public class AddressList {
    public static void main (String[] args){
        //calling the constructor automatically
        Address1 cybertekAddress = new Address1();
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22182");

        System.out.println("CybertekSchool address: " + cybertekAddress.toString());
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3200");

        System.out.println("address after update = " + cybertekAddress);
        System.out.println("street info = " + cybertekAddress.getStreet());

        Address1 newAddress = new Address1();
        newAddress.setStreet("7921 Jones branch dr Suite 200");
        newAddress.setCity("McLean");
        newAddress.setState("VA");
        newAddress.setZipCode("22102");
        System.out.println(newAddress.toString());

        Address1 papaJohnPizza = new Address1("8501 Tyco Rd Ste 1A", "Vienna", "VA", "22182");
        System.out.println("Papa John pizza = " + papaJohnPizza.toString());
    }
}
