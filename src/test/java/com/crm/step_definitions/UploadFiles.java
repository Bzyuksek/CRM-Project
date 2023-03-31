package com.crm.step_definitions;

import com.crm.pages.Crm_ActivityStreamPage;
import com.crm.pages.PageLogin;
import com.crm.pages.UploadPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UploadFiles {
Crm_ActivityStreamPage crm_activityStreamPage = new Crm_ActivityStreamPage();
UploadPage uploadPage = new UploadPage();
PageLogin pageLogin = new PageLogin();

    @Given("User is CRM activity stream page to upload a file")
    public void user_is_crm_activity_stream_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa_url"));
        pageLogin.login();}
    @When("User clicks Upload files button")
    public void user_clicks_upload_files_button() {
        crm_activityStreamPage.messageButton.click();
        uploadPage.uploadFileButton.click();
        BrowserUtils.waitFor(2);

    }
    @When("User sees Upload files send images and selects files")
    public void user_sees_upload_files_send_images() {
String path = "/Users/b/Desktop/test4.txt";

WebElement fileUpload = Driver.getDriver().findElement(By.xpath("//input[@name='bxu_files[]']"));

//WebElement fileUpload = Driver.getDriver().findElement(By.name("inputFiles"));
        BrowserUtils.waitFor(2);
        fileUpload.sendKeys(path);
    }

    @Then("User clicks send button and uploads own files")
    public void user_clicks_send_button() {
        BrowserUtils.waitFor(2);
        uploadPage.saveButton.click();

WebElement uploadedFile = Driver.getDriver().findElement(By.xpath("//a[@id='disk-attach-545']"));
        Assert.assertTrue(uploadedFile.isDisplayed());

    }

////a[@id='disk-attach-540']
}

