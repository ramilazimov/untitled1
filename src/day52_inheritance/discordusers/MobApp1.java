package day52_inheritance.discordusers;

public class MobApp1 {
    private String name;
    private double version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public void useTheApp1(int minutes){
        System.out.println("Using " + name + " app for " + minutes + "minutes");

    }
    protected boolean download(){
        System.out.println("App :" + name + " version " + version + " is downloaded");
        return true;
    }
}
