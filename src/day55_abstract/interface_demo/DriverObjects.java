package day55_abstract.interface_demo;

public class DriverObjects {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        FireFoxDriver driver1 = new FireFoxDriver();
        WebDriver driver2 = new ChromeDriver();
        driver.get("https://www.google.com");
        driver1.findElement("//input[@name='q']");

    }
}
