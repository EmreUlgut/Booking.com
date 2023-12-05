package com.capstoneproject.testbase;

import com.capstoneproject.pages.*;

public class PageInitializer extends BaseClass {

    public static LoginPage loginPage;
    public static CheapestHotelFinder cheapestHotelFinder;
    public static PremiumCarRental premiumCarRental;
    public static Register register;
    public static CheapestCruisesFinder cheapestCruisesFinder;

    public static void initialize() {

        loginPage = new LoginPage(driver);
        cheapestHotelFinder = new CheapestHotelFinder(driver);
        premiumCarRental = new PremiumCarRental(driver);
        register = new Register(driver);
        cheapestCruisesFinder = new CheapestCruisesFinder(driver);
    }






}
