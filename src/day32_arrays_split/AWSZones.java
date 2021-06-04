package day32_arrays_split;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";
        System.out.println("---------------Starting deploying etsy app to AWS zones");
        String[] zonesSplit = zones.split(",");
        for(String each: zonesSplit){
            System.out.println("deploying " + app + " to us-east-1" + each);
            System.out.println("Deployment completed for " + each);
        }
    }
}
