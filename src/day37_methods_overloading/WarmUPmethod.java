package day37_methods_overloading;

public class WarmUPmethod {
    public static void main(String[] args) {
        loginVoid("Cybertekstudent","abc123");//positive test/ sunny day
        loginVoid("cybertek","answer");//negative test/rainy test
        if(login("cybertekStudent","abc123")){
            System.out.println("welcome to cybertek");
        } else {
            System.out.println("login failed");
        }
        boolean isLoginSuccess = login("naidr","mountain");
        System.out.println("isLoginSuccess = " + isLoginSuccess);

        if(login("naidr","mountain")){
            System.out.println("welcome to canvas, select course or calendar");
        } else {
            System.out.println("wrong");
        }

    }
    public static void loginVoid(String userName,String password){
         String secretUsername ="cybertekStudent",
                secretPassword = "abc123";
        if(userName.equalsIgnoreCase(secretUsername) &&
                password.equalsIgnoreCase(secretPassword) ){
            System.out.println("Login succsesfull, welcome Cybertek!");
        } else {
            System.out.println("incorrect username or password");
        }
    }
    public static boolean login(String userName,String password){
        String secretUsername ="cybertekStudent";
        String secretPassword = "abc123";
        return userName.equalsIgnoreCase(secretUsername) &&
                password.equalsIgnoreCase(secretPassword);


    }




}
