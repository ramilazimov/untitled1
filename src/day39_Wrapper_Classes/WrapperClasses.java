package day39_Wrapper_Classes;

public class WrapperClasses {
    public static void main(String[] args) {
        int num = 100;
        num += 10;
        System.out.println(num);

        Integer n = new Integer(500);
        System.out.println("is n 500? = " + n.equals(500));
        System.out.println(n + 500);
        Integer n2 = 1000;
        System.out.println(n2 / 50);
        String numStr = n2 + "";
        String numSt = n2.toString();
        Byte b1 = new Byte((byte)5);
        Byte b2 = 10;
        Short sh1 = new Short((short)40);
        Short sh2 = 50;
        Integer i1 = new Integer(100);
        Integer i2 = 200;
        Long l1 = new Long(300L);
        Long l2 = 3455L;
        Float fl1 = new Float(5.2F);
        Float fl2 = 45.3F;
        Float fl3 = 467.56F;
        Character ch1 = new Character('Q');
        Character ch2 = 'V';


        Boolean bl1 = new Boolean(true);
        Boolean bl2 = false;


    }
}
