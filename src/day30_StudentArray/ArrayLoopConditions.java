package day30_StudentArray;

public class ArrayLoopConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

       String [] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};
        for(double eachPrice : prices){
            if(eachPrice > 100.0){
                System.out.println(eachPrice+ "");


            }
            if(eachPrice>10 && eachPrice<70){
                System.out.println(eachPrice+ "");
            }
        }
        for(int i = 0; i <= 100;i++){
           // System.out.println(countries[i]);
        }
        int count = 0;
        for(double prices1 : prices ){
            if(prices1 > 50){
                count++;
            }
        }
        System.out.println("count = " + count);
        System.out.println("____________________________________");
   for (String country : countries){
       if(country.length()>7){
           System.out.println(country + " ");
       }
   }
   }

    }


