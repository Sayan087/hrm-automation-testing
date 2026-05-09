package com.hrm.automation.base;

import com.hrm.automation.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {

        // Use system-installed ChromeDriver (avoid download)
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        // Configure Chrome for EC2 (headless environment)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");              // run without GUI
        options.addArguments("--no-sandbox");                // required for AWS
        options.addArguments("--disable-dev-shm-usage");     // avoid memory issues
        options.addArguments("--disable-gpu");               // stability
        options.addArguments("--remote-allow-origins=*");    // avoid connection issues

        driver = new ChromeDriver(options);

        // Wait settings
        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(5));

        // Open application
        driver.get(ConfigReader.get("url"));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
