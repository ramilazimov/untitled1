package day39_Wrapper_Classes;

public class WrapperPracticing {
    public static void main(String[] args) {
        int n = 50;
        Integer num = n;



        //System.out.println(num);

        int n2 = num;
        System.out.println(n2);

        String total = "500";
        int count = Integer.parseInt(total);
        int count1 = Integer.parseInt("500");
        System.out.println(count + "   " + count1);
    }
}
