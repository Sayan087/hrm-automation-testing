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

        // Headless mode for EC2 (no GUI)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        driver = new ChromeDriver(options);

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(5));

        driver.manage().window().maximize();

        driver.get(ConfigReader.get("url"));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
