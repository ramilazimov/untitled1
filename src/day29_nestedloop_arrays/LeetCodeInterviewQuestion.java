package day29_nestedloop_arrays;

public class LeetCodeInterviewQuestion {
    public static void main(String[] args) {
        String indexOfSumInt = "";
        int[] nums = {3,2,7,11,15,5,4,6,3};// target integer 9
        for(int i =0; i < nums.length;i++){
            if(nums[i] < 9 ){
                for(int j = i;j < nums.length;j++){
                    if(nums[i] + nums[j] == 9){
                        indexOfSumInt += i+ " " + j;

                    }
                }
            }
        }
        System.out.print(indexOfSumInt);
    }
}
