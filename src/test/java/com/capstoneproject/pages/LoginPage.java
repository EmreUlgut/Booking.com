package com.capstoneproject.pages;

import com.capstoneproject.testbase.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    @FindBy(xpath = "//div[@class= 'abcc616ec7 c180176d40']")
    public WebElement signIn;
    @FindBy(id="username")
    public WebElement emailInputLocator;
    @FindBy(id="password")
    public WebElement passwordInputLocator;
    @FindBy(xpath ="//span[normalize-space()='Sign in']" )
    public WebElement signinButton;
    @FindBy(xpath = "//div[text()='Your account']")
    public WebElement yourAccount;
    @FindBy(xpath = "//div[@id='password-note']")
    public WebElement errorMessage;
    @FindBy(xpath = "//span[normalize-space()='Continue with email']")
    public WebElement continueWithEmail;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(BaseClass.driver, this);
    }

}
