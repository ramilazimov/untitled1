package OfficceHours_06_14_2021;

public class CandyFactory {
    public static void main(String[] args) {
        CandyPractice candyPractice = new CandyPractice("generic",10,true);
        System.out.println(candyPractice);

        Take5Practice take5Practice = new Take5Practice(3,true);
        System.out.println(take5Practice);
        System.out.println(CandyPractice.getNumberOfTotalCandy());
    }
}
