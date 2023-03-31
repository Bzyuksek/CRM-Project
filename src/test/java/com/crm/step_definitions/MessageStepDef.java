package com.crm.step_definitions;

import com.crm.pages.Crm_ActivityStreamPage;
import com.crm.pages.PageLogin;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MessageStepDef {

PageLogin pageLogin = new PageLogin();


Crm_ActivityStreamPage crm_activityStreamPage = new Crm_ActivityStreamPage();


    @Given("User is CRM activity stream page")
    public void user_is_crm_activity_stream_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa_url"));
        pageLogin.login();


    }
    @When("User clicks message button")
    public void user_clicks_message_button() {
        crm_activityStreamPage.messageButton.click();
        BrowserUtils.waitFor(2);




    }
    @And("User types Text on message menu")
    public void user_types_on_message_menu() {

        WebElement textBox = Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
        Driver.getDriver().switchTo().frame(textBox);


        BrowserUtils.waitFor(3);


    Driver.getDriver().findElement(By.xpath("//body")).sendKeys("Text4");

        //driverPool.switchTo().frame(crm_activityStreamPage.textBox2);
        //"bx-editor-iframe");


       // crm_activityStreamPage.textBox2.sendKeys("Text");

       // WebElement text1= driverPool.findElement(By.xpath("//body[@class='vsc-initialized']"));


        //crm_activityStreamPage.textMessage.click();

       // crm_activityStreamPage.textBox.sendKeys(string);
       //Driver.getDriver().get(ConfigurationReader.getProperty("message"));

       //crm_activityStreamPage.messageText.sendKeys("Text");
        ////*[@id="bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm"]/iframe
//crm_activityStreamPage.textBox4.click();
        //BrowserUtils.waitFor(3);

        //crm_activityStreamPage.textMessage.sendKeys("txt");


//Driver.getDriver().get(ConfigurationReader.getProperty("message"));

 Driver.getDriver().switchTo().parentFrame();
    }
    @And("User click send button")
    public void user_click_send_button() {

crm_activityStreamPage.saveButton.click();

    }
    @Then("User sees own message")
    public void user_sees_own_message() {
        String expectedText = crm_activityStreamPage.lastInsertedText.getText();
        String actualText = "Text4";

        Assert.assertEquals(expectedText,actualText);

        Driver.closeDriver();

    }
}
