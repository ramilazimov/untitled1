package ElgunPractice;

public class Number0f1MoreThan4 {
    public static void main(String[] args) {
        int [] more14 = {1,4,1,4};
        boolean is1MoreThan4= true;
        int count1 = 0;
        int count4 = 0;

        for(int each : more14){
            if(each == 1){
                count1++;
            } else if(each == 4){
                count4 ++;
                  }
             }
        if(count1 > count4){
            is1MoreThan4 =true;
        }else{
            is1MoreThan4 =false;
        }

        System.out.println(is1MoreThan4);
    }



}
