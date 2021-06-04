package day45_OOP;

public class PracRectangleObjects {
    public static void main(String[] args) {
        PracRectangle rectangle = new PracRectangle();
        rectangle.setDimensions(10.00,20.00);
        rectangle.setDimensions(7.00,8.00);
        rectangle.getArea();
        System.out.println(rectangle.getArea());
        System.out.println(rectangle);


    }
}
