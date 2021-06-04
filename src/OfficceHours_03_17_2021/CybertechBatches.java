package OfficceHours_03_17_2021;

public class CybertechBatches {
    public static void main(String[] args) {
        String batchType = "US";
        if(batchType.equals("US") || batchType.equals("us")){
            boolean isMorning = false;
            if(isMorning){
                System.out.println("class times 10-5 EST");

            }else {
                System.out.println("class 7-10 EST");
            }


        } else if(batchType.equals("EU") || batchType.equals("eu")){
            System.out.println("class times 10-5 EST");

        } else {
            System.out.println("Invalid Batch type");

        }
    }
}
