package day55_abstract.interface_demo;

public class ChromeDriver implements WebDriver{
    public ChromeDriver(){
        System.out.println("Launching chrome browser");
    }

    @Override
    public void get(String url) {
        System.out.println("ChromeDriver - navigating to " + url);


    }


    public void findElement(String locator) {
        System.out.println("ChromeDriver - locating element by " + locator);
    }


    public void quit() {
        System.out.println("ChromeDriver - quitting the driver");
    }


    public String getTitle() {
        return " wooden spoon ";
    }
}
