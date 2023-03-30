package com.crm.step_definitions;

import com.crm.pages.PageLogin;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    PageLogin pageLogin = new PageLogin();


    @Given("I am on login page")
    public void i_am_on_login_page() {

        String url = ConfigurationReader.getProperty("qa_url");
        Driver.getDriver().get(url);
    }
    @When("user login as hr")
    public void user_login_as_hr() {
        String username = ConfigurationReader.getProperty("hr_user");
        String password = ConfigurationReader.getProperty("hr_pass");


        pageLogin.usernameInput.sendKeys(username);
        pageLogin.passwordInput.sendKeys(password);
        pageLogin.loginButton.click();

    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {

    }
}
