package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {
        String cats = "bengal cat tabby cat persian cat no cat here";

        String[] catsSplit = cats.split(" ");
        int count = 0;
//        System.out.println("number of cat =" + (catsSplit.length-1));
          for(int i = 0;i < catsSplit.length;i++){
              if(catsSplit[i].equals("cat")){
                  count++;
              }
          }
        System.out.println(count);



    }
}
