package day16_swtch_ternary;

public interface Elevator {
    public static void main(String[] args) {
        int floorNum = 7;
        if(floorNum == 1){
            System.out.println(" floor 1 selected. Companies : Lobby, Verizon,Starbucks");
        } else if(floorNum == 2){
            System.out.println(" floor 2 selected. Companies : Cybertek, NASA, Intelsat");
        } else if(floorNum == 3){
            System.out.println("floor 3 selected. Companies : Lyft, SteakHouse,");
        } else {
            System.out.println("Invalid number " + floorNum);
        }
        System.out.println(" Switch STATEMENT");
        floorNum = 4;
        switch (floorNum){
            case 1:// exit the switch statement
                System.out.println("floor 1 selected. Companies : Lobby, Verizon,Starbucks");
                break;
            case 2:
                System.out.println("floor 2 selected. Companies : Cybertek, NASA, Intelsat");
                break;
            case 3:
                System.out.println("floor 3 selected. Companies : Lyft, SteakHouse");
                break;
            default:
                System.out.println("invalid floor - " + floorNum);
                break;
        }
    }
}
