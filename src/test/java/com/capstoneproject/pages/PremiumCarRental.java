package com.capstoneproject.pages;

import com.capstoneproject.testbase.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PremiumCarRental extends BaseClass {

    @FindBy(xpath = "//a[@id='cars']")
    public WebElement carRental;

    @FindBy(xpath = "//input[@id='searchbox-toolbox-fts-pickup']")
    public WebElement pickUpLocationTextBox;

    @FindBy(xpath = "//div[@class='searchbox-toolbox-fts__suggestion searchbox-toolbox-fts__suggestion--C']")
    public WebElement suggestedOption;

    @FindBy(xpath = "//div[@data-testid='searchbox-toolbox-date-picker-pickup-date-value']")
    public WebElement pickUpBox;

    @FindBy(xpath = "//span[@aria-label='12 December 2023']//span[contains(text(),'12')]")
    public WebElement pickUpDate;

//    @FindBy(id = "//button[@id='searchbox-toolbox-date-picker-dropoff-date']")
//    public WebElement dropOfBox;
    @FindBy(xpath = "//span[@aria-label='16 December 2023']//span[contains(text(),'16')]")
    public WebElement dropOffDate;

    @FindBy(xpath = "//div[@class='LPCM_92786005']")
    public WebElement searchButton;

    @FindBy(xpath = "//*[name()='path' and contains(@d,'M19.5 15.7')]")
    public WebElement premiumCar;

    @FindBy(xpath = "(//div[@class='SM_f3f1fc59 SM_ac96fc73 SM_5057af42'])[1]")
    public WebElement typeOfCar;

    @FindBy(xpath = "(//div[@class='SM_ff31c0fa SM_37547395'])[1]")
    public WebElement carBrand;

    @FindBy(xpath = "(//div[@class='SM_7d1e8d72 SM_2fdb9657'])[1]")
    public WebElement priceofRentalCar;

    public PremiumCarRental(WebDriver driver) {
        PageFactory.initElements(BaseClass.driver, this);
    }
}
