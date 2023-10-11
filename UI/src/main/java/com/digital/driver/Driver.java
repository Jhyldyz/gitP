package com.digital.driver;

import com.digital.config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {
    private Driver() {
        //Singleton patter
        //если создали приват конструктор мы не можем сод=здать обьект этого класса

    }

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser").toLowerCase()) {
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver = FireFoxWebDriver.loadFirefoxWebDriver();
                    break;
                default:
                    throw new IllegalArgumentException("You provide wrong Driver name");
            }
        }
        return driver;
    }

    public static void closeDriver() {
        try {
            if (driver != null) {
                driver.close();
                driver.quit();
                driver = null;
            }
        } catch (Exception e) {
            System.out.println("Error while closing the driver");
        }
    }
}
