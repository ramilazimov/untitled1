package HomeTasks;

public class Operator1 {
    public static void main(String[] args) {
        int a =  5;
        int b = a++ + a-- + a * 2 + a + ++a;
        System.out.println(a);
        System.out.println(b);


        int a1 = 200;
        int b1 = -a1++ + - --a1 * a1-- % 2 + a;
        System.out.println(a1);
        System.out.println(b1);

        int x = 300;
        int y = 400;
        int z = x + y + x * y + x/y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
