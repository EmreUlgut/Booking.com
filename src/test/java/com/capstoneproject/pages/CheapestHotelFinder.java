package com.capstoneproject.pages;

import com.capstoneproject.testbase.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheapestHotelFinder extends BaseClass{

    @FindBy(xpath = "//input[@id=':re:']")
    public WebElement whereTo;
    @FindBy(xpath ="//span[@aria-label='10 December 2023']//span[contains(text(),'10')]" )
    public WebElement checkInDate;
    @FindBy(xpath = "//span[@aria-label='17 December 2023']//span[contains(text(),'17')]")
    public WebElement checkOutDate;
    @FindBy(xpath = "//span[normalize-space()='Search']" )
    public WebElement search;
    @FindBy(xpath = "//span[@class='ccb65902b2']")
    public WebElement sortDropDown;
    @FindBy(xpath = "//span[normalize-space()='Price (lowest first)']")
    public WebElement priceLowest;
    @FindBy(xpath = "//span[@data-testid='price-and-discounted-price']")
    public WebElement hotelPrice;
    @FindBy(xpath = "//div[@data-testid='title']")
    public WebElement hotelName;
    @FindBy(xpath = "//div[@class='a3332d346a'][normalize-space()='New York']")
    public WebElement clickDestination;
    @FindBy(xpath = "//span[@class='ccb65902b2']")
    public WebElement sortedFilter;

    public CheapestHotelFinder(WebDriver driver) {
        PageFactory.initElements(BaseClass.driver, this);
    }

}
