package day51_Exeption.Browsers;

public class FireFoxDriver extends WebDriver{

    public void get(String url) {
        System.out.println("Opening the "+url+" in Firefox browser");

    }

    public void close() {
        System.out.println("Closing the firefox browser");

    }
}
