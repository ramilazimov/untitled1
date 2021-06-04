package ReplPractice.methods;

public class CheckIfNUmberSiPalindrome {
    public static void main(String[] args) {
      int num = 4224;
     isPalindrome(num);
    }
    public static void isPalindrome(int num){

        int temp = num;
        int newNum = 0;
        while(temp !=0){
            newNum = newNum *10 + temp % 10;
            temp = temp/10;
        }
        System.out.println((newNum == num));
//
//        int temp = num;
//        int newNum = 0;
//        while (temp !=0){
//           newNum = newNum * 10 + temp % 10;
//           temp = temp/10;
//        }
//        System.out.println((newNum == num));
    }
}
