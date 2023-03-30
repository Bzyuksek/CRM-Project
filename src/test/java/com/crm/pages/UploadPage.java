package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadPage {

    public UploadPage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(xpath = "//*[@id='microoPostFormLHE_blogPostForm_inner']/span[1]")
    public WebElement messageButton;

    @FindBy(xpath= "//*[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//*[@id='diskuf-selectdialog-KWo5GUA']/div[2]/table/tbody/tr[1]/td[1]/div/input")
    public WebElement filesAndImages;

////span[contains(text(),'Message')]//following::input[@name='bxu_files[]']

    //@FindBy(xpath =("//input[@name='bxu_files[]']"))
    //public WebElement inputFiles;

//@FindBy(xpath = "//span[contains(text(),'Message')]//following::input[@name='bxu_files[]']")
//public WebElement filesAndImages;

////*[@id="diskuf-selectdialog-KWo5GUA"]/div[2]/table/tbody/tr[1]/td[1]/div/input

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement saveButton;

    ////button[@id='blog-submit-button-save']

}