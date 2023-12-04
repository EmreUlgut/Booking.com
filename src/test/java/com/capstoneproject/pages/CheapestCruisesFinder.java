package com.capstoneproject.pages;

import com.capstoneproject.testbase.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheapestCruisesFinder extends BaseClass {

@FindBy(xpath = "//a[@id='cruises']" )
public WebElement cruises;

@FindBy(xpath = "//input[@id='autoComplete']")
public WebElement cruisesWhereDo;

@FindBy(xpath = "//span[normalize-space()='Bahamas']")
public WebElement cruisesBahamas;

@FindBy(xpath="//a[@id='hp_searchContinue']")
public WebElement cruisesViewCruises;

@FindBy(xpath = "//*[@id='sortResultsBy']/span")
public WebElement cruisesSortBy;

@FindBy(xpath = "//label[@id='sortLabel_1']")
public WebElement cruisesPriceLowToHigh;

@FindBy(xpath="//a[@id='sortResultsByClose']")
public WebElement cruisesApplyButton;

@FindBy(xpath = "//h2[@id='brochureName1']")
public WebElement cruisesTwoNightBahamas;




    public CheapestCruisesFinder(WebDriver driver) {PageFactory.initElements(BaseClass.driver, this);}

}




