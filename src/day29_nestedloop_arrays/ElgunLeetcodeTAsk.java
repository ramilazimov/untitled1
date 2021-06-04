package day29_nestedloop_arrays;

public class ElgunLeetcodeTAsk {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15,5,4};
        System.out.println(indexOfTwoSum(nums, 9));

    }
    public static String indexOfTwoSum(int[] num,int target){
       String result = "";
       for(int i =0;i < num.length;i++){
           for(int j =0;j < num.length;j++){
               if(num[i] + num[j] == target && i != j){
                   result += i + " " + j;
                   break;
               }
           }
           if(!result.isEmpty()){
               break;
           }
       }
       return result;
    }
    }

