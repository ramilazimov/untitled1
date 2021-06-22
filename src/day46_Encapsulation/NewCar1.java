package day46_Encapsulation;

public class NewCar1 {
    String model;
    private int year;
    private int mileage;

    // setter method for a model
    public void setModel(String carModel){
        model = carModel;
    }

//    getter method for model

    public String getModel(){
        return model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;

    }

    @Override
    public String toString() {
        return "NewCar{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }

    public int getMileage(){
        return mileage;
    }
}
