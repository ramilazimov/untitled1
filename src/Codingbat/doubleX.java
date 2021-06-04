package Codingbat;

public class doubleX {
    public static void main(String[] args) {
        boolean isXX =false;
        String str = "axbxxb";
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                   isXX =true;
            }
        }
        System.out.println(isXX);

    }

}

