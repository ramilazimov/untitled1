package day13_conditional_statements;

public class IfWithBooleanVariables {
    public static void main(String[] args) {
        boolean isHungry = false;
        // if(isHungry == false)
        if(isHungry){
            System.out.println("I am hungry need to get something to eat!");
            System.out.println("then code Java");
        } else {
            System.out.println("I am not hungry, I will keep coding java ");
        }


        double price = 400.44;
        boolean isAffordable = price >= 200.00;
        System.out.println("isAffordable = " + isAffordable);
        if(isAffordable){
            System.out.println("Its affordable for you");
        } else  {
            System.out.println("its not affordable");
        }

        boolean isRemoteJob = true;
        if (isRemoteJob != true){  //we can use if (!isRemoteJob) also
            System.out.println("Sure I am interested , what is the interview process ");
        } else {
            System.out.println("Sorry I am not interested");
        }


    }
}
