package day44_Custom_classes;

public class AppMethod {
    public static void main(String[] args) {
        App uberApp = new App();

        uberApp.name = "uberApp";
        uberApp.version = 13.77;
        uberApp.open();

        App doordash = new App();
        doordash.version = 7.77;
        doordash.name = "doordashApp ";
        doordash.playing("Ramil");



    }
}
