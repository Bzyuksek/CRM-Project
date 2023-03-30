package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin {

    public PageLogin(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(name="USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(xpath= "//input[@class='login-btn']")
    public WebElement loginButton;

   public void login(){

        this.usernameInput.sendKeys("hr2@cybertekschool.com");
       this.passwordInput.sendKeys("UserUser");
        this.loginButton.click();
    }

}
