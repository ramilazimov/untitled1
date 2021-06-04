package SaimTask.Array2;

public class Appears2 {
    public static void main(String[] args) {
        int[] arr = {4,2,2,3};
        int count = 0;
        boolean numbs2 = false;
        for(int i =1;i<arr.length;i++){
            if(arr[i] == 2){
                count++;
            }
            if(arr[i] == 2 && count >=2  && arr[i+1] ==2){
                numbs2 = true;

            }else {
                numbs2 = false;
            }
        }
        System.out.println(numbs2);
    }
}
