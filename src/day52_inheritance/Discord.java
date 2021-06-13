package day52_inheritance;

public class Discord  extends MobileApp {
    public void chat(String someone){
        System.out.println(" Chatting with " + someone + " on Discord");
    }
@Override
 public boolean download(){
    System.out.println(" Downloaded Discord 0.0.23 from App store");
    return true;
}

    /**
     * override download method
     */

@Override
public void useTheApp(int minutes){
    super.useTheApp(minutes);
    chat("Ramil");
}
 public void printInfo(){
     System.out.println(" App Name = " + getName());
     System.out.println(" App version = " + getVersion());
 }


}
