package com.capstoneproject.testbase;

import com.capstoneproject.utils.ConfigsReader;
import com.capstoneproject.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;

    /**
     * This method will create a driver and return it
     *
     * @return WebDriver driver
     */
    public static WebDriver setUp() {
        ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);

        switch (ConfigsReader.getProperty("browser").toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--incognito");
                options.addArguments("--disable-blink-features=AutomationControlled");

                driver = new ChromeDriver(options);
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
                driver = new FirefoxDriver();
                break;

            case "edge":
                System.setProperty("webdriver.edge.driver", Constants.EDGE_DRIVER_PATH);
                driver = new EdgeDriver();
                break;

            default:
                throw new RuntimeException("Browser is not supported!");
        }

        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfigsReader.getProperty("url"));

        // we initialize all the page elements of the classes in package com.capstoneproject.pages
        PageInitializer.initialize();


        return driver;
    }

    /**
     * This method will quit the browser
     */
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}

