package day45_OOP;

public class TrafficLights {
   String color;
   //this is read only method, displays value of color variable
   public void showColor(){
       System.out.println("current color =" + color);
   }
   //this method update color
   public void changeColor(String newColor){

       if(newColor.equalsIgnoreCase("red") ||newColor.equalsIgnoreCase("green") || newColor.equalsIgnoreCase("yellow")){
           System.out.println("changing color to " + newColor);
           color = newColor;
       } else {
           System.out.println("invalid color");
       }


   }
}
