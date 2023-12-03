package com.capstoneproject.testbase;

import com.capstoneproject.pages.CheapestHotelFinder;
import com.capstoneproject.pages.LoginPage;
import com.capstoneproject.pages.PremiumCarRental;

public class PageInitializer extends BaseClass {

    public static LoginPage loginPage;
    public static CheapestHotelFinder cheapestHotelFinder;
    public static PremiumCarRental premiumCarRental;

    public static void initialize() {
        loginPage = new LoginPage(driver);
        cheapestHotelFinder = new CheapestHotelFinder(driver);
        premiumCarRental = new PremiumCarRental(driver);

    }






}
