package com.cybertek.library.pages;

import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);}

    private WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);


        @FindBy (id = "inputEmail")
        public WebElement username;

    @FindBy (id = "inputPassword")
    public WebElement password;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement signIn;


    @FindBy (xpath = "//h2[@id='user_count']")
    public WebElement usercount;

    public void loginLibrarian(){
        wait.until(ExpectedConditions.elementToBeClickable(username)).sendKeys(ConfigurationReader.getProperty("lib22_user"));
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(ConfigurationReader.getProperty("lib22_pass"));


signIn.click();

    }

    public void loginStudent(){
        wait.until(ExpectedConditions.elementToBeClickable(username)).sendKeys(ConfigurationReader.getProperty("student95_user"));
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(ConfigurationReader.getProperty("student95_pass"));


        signIn.click();

    }






}
