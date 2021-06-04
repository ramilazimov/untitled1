package Codingbat;

public class PrintNames {
    public static void main(String[] args) {
        String names = "Once there was a woman name:angelina: " +
                "and a man name:tony: and their friend name:jane: and ...";
        printNames("Once there was a woman name:angelina: " +
                "and a man name:tony: and their friend name:jane: and ...");
    }
    public static void printNames(String string){
        int i =0;
        while(true){
            int found = string.indexOf(":",i);
            if(found == -1)break;
            int start  = found + 1;
            int end = string.indexOf(":",start);
            System.out.println(string.substring(start,end));
            i = end + 1;
        }

    }


}
