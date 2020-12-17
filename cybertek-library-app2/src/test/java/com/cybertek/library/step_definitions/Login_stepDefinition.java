package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_stepDefinition {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);

    LoginPage loginPage=new LoginPage();

    ////////////////Login as Librarian/////////////////////


    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));
    }

    @When("I login as a librarian")
    public void i_login_as_a_librarian() {
      loginPage.loginLibrarian();

    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {

        String expectedTitle="Library";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }
    ////////////////Login as Student/////////////////////

    @When("I login as a student")
    public void i_login_as_a_student() {


            loginPage.loginStudent();

    }

    ////////////////Login as Librarian with Parametrization/////////////////////


    @When("I enter username {string}")
    public void i_enter_username(String usernm) {
        loginPage.username.sendKeys(usernm);

    }

    @When("I enter password {string}")
    public void i_enter_password(String pswd) {

        loginPage.password.sendKeys(pswd);
    }

    @When("click the sign in button")
    public void click_the_sign_in_button() {
        loginPage.signIn.click();

    }



    @Then("there should be {string} users")
    public void there_should_be_users(String string) {
        String actual=wait.until(ExpectedConditions.visibilityOf(loginPage.usercount)).getText();


        String exp =string;
        Assert.assertEquals(actual,exp);


    }


    ////////////////Login as Librarian with Parametrization2/////////////////////

    @When("I login using {string} and {string}")
    public void i_login_using_and(String string, String string2) {

        loginPage.username.sendKeys(string);
        loginPage.password.sendKeys(string2);
        loginPage.signIn.click();




    }








}
