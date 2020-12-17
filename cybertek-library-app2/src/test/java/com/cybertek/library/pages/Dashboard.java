package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard {

    public Dashboard(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);

    @FindBy (className = "nav-link")
    public WebElement usersLink;




}
