package ReplPractice.methods;


public class InsertString {
    public static void main(String[] args) {
        System.out.println(at3("hermes", "ramil"));
        System.out.println(removeFirst("rthjhjk"));
    }
    public  static String at3(String target,String insert){
        return  target.substring(0,3) + insert + target.substring(3);
    }

  public static String removeFirst(String target){
        return target.replace(target.substring(0,1),"");

  }
}
