package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(1,2);
        addNumbers(2,3,4,5,6,7,8);
        addNumbers(34,3,546,67,87,67,8,9,45,34,23,12,34,54,77);
        addNumbers();
    }
    public static void addNumbers (int... nums) {
        int sum = 0;
        for(int n : nums){
            sum += n;
        }
        System.out.println("sum = " + sum);

    }


    public static String repeatString(String word, int times, char delimiter) {
        String retValue = "";
        for(int i = 1; i <= times; i++) {
            //take care of last delimiter:
            if(i == times) { //if last iteration
                retValue += word; //add only word by itself
            } else {
                retValue += word + delimiter; //add with delimiter
            }
        }
        return retValue;
    }
}
