package DriverWrapper;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Web {
    private static WebDriver driver;
    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "./DriverExe/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://clubs3qa1.scholastic.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @After
    public void quitDriver() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
