package ReplePractice.OOP;

public class Calc2nd {
    private int x;
    private int y;
    private int result;

      public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getResult() {
        return result;
    }

       public void plus(){
        result = x + y;
    }
    public void minus(){
        result = x-y;
    }

    public static void main(String[] args) {
        Calc2nd a = new Calc2nd();
        a.setX(10);
        a.setY(7);
        a.minus();
        System.out.println(a.getResult()); Calc2nd b = new Calc2nd();
        b.setX(10);
        b.setY(7);
        b.plus();
        System.out.println(b.getResult());


    }


}
