package day51_Exeption.Browsers;

public class ChromeBrowser extends WebDriver{

    public void get (String url){
        System.out.println("Opening the "+url+" in Chrome browser");

            }

    public void close(){
        System.out.println("Closing the Chrome browser");
    }
}
