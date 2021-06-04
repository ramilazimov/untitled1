package ReplPractice.loop;

public class PrintLetters {
    public static void main(String[] args) {
        String str = "2hjhnbGVF56Fvcb";

        int upperCase = 0,lowercase = 0,numbers = 0;
        for(int i = 0; i<=str.length()-1;i++){

            char eachLetter = str.charAt(i);
            if(eachLetter >= 'A' && eachLetter<='Z'){
                upperCase++;
            } else if(eachLetter >= 'a' && eachLetter <='z'){
                lowercase++;
            }else if(eachLetter >= '0' && eachLetter <='9'){
                numbers++;


            }

        }
        System.out.println("upperCase " + upperCase);
        System.out.println("lowercase " + lowercase);
        System.out.println("numbers " + numbers);




    }
}
