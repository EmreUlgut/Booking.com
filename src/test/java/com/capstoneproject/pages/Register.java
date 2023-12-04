package com.capstoneproject.pages;

import com.capstoneproject.testbase.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register extends BaseClass {

@FindBy(xpath = "//a[@aria-label='Create an account']//span[@class='e4adce92df'][normalize-space()='Register']")
    public WebElement register;
@FindBy(xpath = "//input[@id='username']")
public WebElement registerEmailInput;

@FindBy(xpath="//button[@type='submit']")
public WebElement registercontinueWithEmail;

@FindBy(xpath = "//input[@id='new_password']")
public WebElement registerPasswordInput;

@FindBy(xpath = "//input[@id='confirmed_password']")
public WebElement registerConfirmPasswordInput;

@FindBy(xpath="//button[@type='submit']")
public WebElement registerCreateAccountButton;

@FindBy(xpath="//div[normalize-space()='Your account']")
public WebElement registerYourAccount;

    public Register(WebDriver driver) {PageFactory.initElements(BaseClass.driver, this);}

}


