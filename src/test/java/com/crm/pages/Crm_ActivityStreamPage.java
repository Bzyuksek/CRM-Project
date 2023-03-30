package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Crm_ActivityStreamPage {


    public Crm_ActivityStreamPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
@FindBy (xpath = "//*[@id='microoPostFormLHE_blogPostForm_inner']/span[1]")
    public WebElement messageButton;

    //@FindBy(xpath = "//body[@class='vsc-initialized']")
    //public WebElement messageText;
    //@FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    //public WebElement messageText;

   // @FindBy(xpath = "//div[class='feed-add-post-text'][1]")
   // public WebElement messageText;

    //@FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    //public WebElement messageText;

    @FindBy(xpath = "//*[@id='bx-html-editor-area-cnt-idPostFormLHE_blogPostForm']")
    public WebElement textBox4;

   // @FindBy(xpath = "//*[@id='divoPostFormLHE_blogPostForm']/div[3]")
//public WebElement txtBox3;


    //@FindBy(xpath = "//body[@contenteditable='true']")
    //public WebElement textBox;

    @FindBy(xpath = "(//div[@class='feed-add-post-text'])[1]")
    public WebElement textBox2;

//@FindBy(xpath = "//body[contains (@style,'min-height: 184px')]")
//public WebElement textMessage;


    @FindBy(xpath ="//button[@id='blog-submit-button-save']" )
    public WebElement saveButton;

    @FindBy (xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement lastInsertedText;



}


