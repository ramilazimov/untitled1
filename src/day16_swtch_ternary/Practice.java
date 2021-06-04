package day16_swtch_ternary;

public class Practice {
    public static void main(String[] args) {
        String size = "venti";
        double price = 0.0;
        int calories = 0;
        switch (size){
            case "tall":
                price = 3.69;
                calories = 90;
                break;
            case "grande":
                price = 3.99;
                calories = 120;
                break;
            case "venti":
                price = 4.66;
                calories = 150;
                break;
            default:
                System.out.println("we dont have that size " + size);


        }
        System.out.println("Price is - $" + price);
        System.out.println("Calories is - " + calories);
        }

    }

