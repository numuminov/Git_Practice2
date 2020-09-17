package day51_Exeption.Browsers;

public class BrowserObjects {
    public static void main(String[] args) {
        ChromeBrowser chrome = new ChromeBrowser();
        chrome.get("https://www.google.com/");
        chrome.close();
        System.out.println("====================");

        FireFoxDriver firefox = new FireFoxDriver();
        firefox.get("https://www.google.com/");
        firefox.close();
        System.out.println("=================");

        OperaBrowser opera =new OperaBrowser();
        opera.get("https://www.google.com/");
        opera.close();

    }
}
