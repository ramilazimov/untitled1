package Practice_03_03_2021;
/*
Make a class Stage1Calculator
create a main method

    - Declare two double variables
    - Declare 5 more double variables for each operation.
        > Execute all the operation between the first two numbers
    - Print out operations
        Ex: if the nums are 5 and 10
            5 + 10 = 15
            5 - 10 = -5
            etc..
 */
public class CalculatoStage1 {
    public static void main(String[] args){
        double numOne = 5.0;
        double numTwo = 10.0;

        double addition = numOne + numTwo;
        double subtraction = numOne - numTwo;
        double multiplication = numOne*numTwo;
        double division = numOne/numTwo;
        double remainder = numOne % numTwo;

        System.out.println("Calculcationfor" + numOne + "&" + numTwo);


    }
}
