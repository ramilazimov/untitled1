package ReplPractice.methods;

public class MethodsProfitOrLoss {
    public static void main(String[] args) {
        System.out.println(c_profits(700, 700));
    }
    public static String c_profits(int buyPrice, int sellPrice){
        if (buyPrice < sellPrice){
            return "profit";
        } else if(buyPrice == sellPrice) {
            return "no loss";
        } else {
            return "loss";
        }
    }

}
