package com.hrm.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    // Locators
    private By userName = By.xpath("//input[@placeholder='Username']");
    private By password = By.xpath("//input[@placeholder='Password']");
    private By loginButton = By.xpath("//button[normalize-space()='Login']");

    // Constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    // Actions
    public void enterUsername(String user){
        driver.findElement(userName).sendKeys(user);
    }

    public void enterPassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickLogin(){
        driver.findElement(loginButton).click();
    }

    // Business method
    public void login(String user, String pwd){
        enterUsername(user);
        enterPassword(pwd);
        clickLogin();
    }
}