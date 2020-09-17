package day51_Exeption.Browsers;

public class WebDriver {
    /*
    09/05/2020
Topics: Method overriding rules
        Overriding vs Overloading
        Super keyword
        Exceptions Intro
package name: day51_Exceptions
Browsers task:
    1. create a class called WebDriver
            actions: get(URL): prints "opening the
            URL in the default browser"
            close(): closes the default browser

     */
    public void get(String url){
        System.out.println("Opening the "+url+" in default browser");
    }
    public void close(){
        System.out.println("Closing the default browser");
    }

}
