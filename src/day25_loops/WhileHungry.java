package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;
       //while (isHungry && bananas != countToFull)
        while(isHungry){
            bananas++;
            System.out.println("still hungry " + bananas);
            if(bananas == countToFull) {
                //isHungry = bananas == countToFull? false: true;
                isHungry = false;
            }


        }
        System.out.println("had enough bananas");
        System.out.println("i am full");
    }


}
