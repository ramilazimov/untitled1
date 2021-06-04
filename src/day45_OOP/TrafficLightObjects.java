package day45_OOP;

public class TrafficLightObjects {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLights lightA = new TrafficLights();
       // lightA.color = "red";
        // we will assighn/update the value of color using a method of the class
        lightA.changeColor("red");
        lightA.changeColor("green");
        TrafficLights lightsObject = new TrafficLights();
        lightsObject.changeColor("red");
        lightsObject.changeColor("green");
    }
}
