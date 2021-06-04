
package ReplPractice.loop;

public class LoopSCatAndDog {
    public static void main(String[] args) {
        String word = "catdogcat";
        int countOfCats = 0;
        int countOfDogs = 0;
        for(int i = 0; i< word.length()-2;i++){
            if(word.substring(i,i+3).equals("cat")){
                countOfCats++;

            }
            if(word.substring(i,i+3).equals("dog")){
                countOfDogs++;
            }


        }
        if(countOfCats == countOfDogs){
            System.out.println(true);
        }else {
            System.out.println(false);
        }



    }
}