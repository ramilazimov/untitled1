package day05_primitives_concatanation;

public class UsingVariables {
    public static void main(String [] args){
        int num1 = 100;
        int num2 = num1;
        System.out.println(num1);//100
        System.out.println(num2);//100
        num2 = num1 = 200;

        System.out.println(num2);//100
        int n1 = 55;
        int n2 = n1;
        int n3 = n2;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        int intirasZipCode = 22182;
        int parvinsZipCode = intirasZipCode;
        System.out.println(intirasZipCode);
        System.out.println(parvinsZipCode);
        intirasZipCode = 20007;
        parvinsZipCode = 33131;
        System.out.println(intirasZipCode);
        System.out.println(parvinsZipCode);

    }
}
