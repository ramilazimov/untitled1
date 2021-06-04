package day19_class_vs_object_strings;

import java.time.Instant;

public class LoginTest {
    public static void main(String[] args) {
        String expUseName = "cybertek";
        String expPassword = "Abc123";
        String userName = "CYBERTEK";
        String password = "abc123";

        if(expUseName.equalsIgnoreCase(userName)  && (expPassword.equalsIgnoreCase(password))){
            System.out.println("Successfully log in " + Instant.now());
        } else {
            if(!expUseName.equalsIgnoreCase(userName)){
                System.out.println(" Fail - username incorrect");
            } else {
                System.out.println("fail - password is incorrect");
            }
        }

    }
}
