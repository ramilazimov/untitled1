package day18_conditions_practice_strings_intro;

public class SwitchNum {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        switch (num1){
            case 10:
                num1++;
                num2+=10;

            case 20:
                num1 +=num2;
                num2--;
                break;
            case 30:
                num1 = 0;
                num2-=3;
                break;
        }
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
