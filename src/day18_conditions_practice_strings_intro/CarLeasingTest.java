package day18_conditions_practice_strings_intro;

import sun.font.DelegatingShape;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make  = "Mercedes";
        String model = "E";
                double leasPrice = 0.0;
//        if(make.equals("Mercedes") && model.equals("E")){
//            leasPrice = 500.0;
//        } else if (make.equals("Mercedes") && model.equals("A")){
//            leasPrice = 400.0;

        if(make.equals("Mercedes")){
            if(model.equals("E")){
                leasPrice = 500.0;
                  } else if (model.equals("A")){
                leasPrice = 400.0;
            } else {

                if(model.equals("E")){
                    leasPrice = 500.0;
                } else if (model.equals("A")){
                    leasPrice = 400.0;
                    if(make.equals("Audi")){
                        if (model.equals("SQ5")){
                            leasPrice = 552.0;
                        }else if(model.equals("A3")){
                            leasPrice = 412.0;
                        }
                    }

            } else {
                    System.out.println("invalid make");
                }

        }
        System.out.println(" make = " + make);
        System.out.println(" make = " + model);
        System.out.println(" make = " + leasPrice);
        }
    }
}
