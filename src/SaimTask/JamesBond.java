package SaimTask;
import java.util.*;
public class JamesBond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fullName = input.next();
        String lastName = input.next();
        if(fullName.contains("bond") && lastName.contains("bond")){
            System.out.println("same last name");
        } else{
            System.out.println("not the same last name");
        }
    }
}
