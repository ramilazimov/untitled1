package SaimTask.loops3;

public class PrimeNumbersKamran {
    public static void main(String[] args) {
              for(int i = 2; i <= 50;i++){
                  int number = 0;
                  for (int j = 1;j<=i;j++){
                      if(i % 1 == 0 && i % j == 0){
                          number++;
                      }
                  }
                  if(number == 2){
                      System.out.print(i + " ");
                  }
              }
    }
}
