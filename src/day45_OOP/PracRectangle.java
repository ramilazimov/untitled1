package day45_OOP;

public class PracRectangle {
    double width;
    double height;
    double area;

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + area +
                '}';
    }



    public void setDimensions(double widthRec,double heightRec){
        width = widthRec;
        height = heightRec;
       area = width * height;

    }
    public double getArea(){
        return area;
    }

}
