package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.Dashboard;
import com.cybertek.library.pages.LoginPage;
import io.cucumber.java.en.When;

public class ShowRecords {

    Dashboard dashboard= new Dashboard();
    LoginPage loginPage = new LoginPage();

    @When("I click on Users link")
    public void i_click_on_users_link() {
        dashboard.usersLink.click();
    }
/*
    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer int1) {

    }

    @Then("show records should have following options:")
    public void show_records_should_have_following_options(io.cucumber.datatable.DataTable dataTable) {

    }

 */

}
