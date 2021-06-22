package day55_abstract.interface_demo;

public interface WebDriver {
    public abstract void get(String url);
    public abstract void findElement(String locator);
    void quit();//it is automatically public abstract
    String getTitle();
}
