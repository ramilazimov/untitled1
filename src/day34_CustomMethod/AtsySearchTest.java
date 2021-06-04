package day34_CustomMethod;

public class AtsySearchTest {
    public static void main(String[] args) {
        System.out.println("-----Starting Etsy Search Smoke Test-----");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed ();
        searchRamil();

    }
    public static void openBrowser(){
        System.out.println("Launching Chrome browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("Navigating tp https://www.etsy.com ");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("Verify Etsy home page is displayed");
        System.out.println("Type 'Wooden spoon' in search field and click search");
    }
    public static void  verifyResultsAreDisplayed (){
        System.out.println("Pass: Search results are successfully displayed");
    }
    public static void searchRamil(){
        System.out.println("Ramil is SDET in famous company");
    }



}
/**
 *
 openBrowser
 navigateToEtsyUrl
 searchForWoodenSpoon
 verifyResultsAreDisplayed
 *
 *
 */
