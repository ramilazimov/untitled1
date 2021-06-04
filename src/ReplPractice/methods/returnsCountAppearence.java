package ReplPractice.methods;

public class returnsCountAppearence {
    public static void main(String[] args) {
        String[] arr = new String[] {"too", "too", "brother","too"};
        String t = "too";
        System.out.println(count(arr,t));
    }

    public static int count (String[] arr,String t){
        int count = 0;
        for(String each : arr){
            if(each.equals(t)){
                count++;
            }
        }
        return count;
    }
}
