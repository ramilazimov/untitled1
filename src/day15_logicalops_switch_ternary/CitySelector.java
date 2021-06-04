package day15_logicalops_switch_ternary;

import sun.font.DelegatingShape;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Boston";

        if (city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println(" we willing to go " + city);
        } else {
            System.out.println("Not I am staying in NY");
        }

        String teacher = "Murodil";
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("its java class " + teacher);
        } else {
            System.out.println("soft skills with Nadir");
        }

        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("its java class " + teacher);
        } else if (teacher.equals("Nadir")) {
        System.out.println(" soft skills class with " + teacher);


    } else {
            System.out.println("some other teachers " + teacher);
        }


        String company = "NadirTech";
        double salary = 100_000;

        if(company.equals("Google") || salary >= 100_000.00){
            System.out.println(" we accept the offer from " + company);
        } else if(company.equals("Microsoft") || company.equals("Apple")){
        System.out.println(" we also accept this offer");
    } else {
            System.out.println(" not keep looking for new offers");
        }

    }

    }


