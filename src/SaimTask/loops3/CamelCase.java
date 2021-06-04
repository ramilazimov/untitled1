package SaimTask.loops3;

public class CamelCase {
    public static void main(String[] args) {
        String camelCAse = "thisHasManyWordsToFind";
        int count = 0;
        for (int i =0;i < camelCAse.length();i++){
            if(camelCAse.charAt(i) > 'A' && camelCAse.charAt(i) < 'Z'){
                count++;
            }
        }
        System.out.println(count + 1);
    }
}
