package com.hrm.automation.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    By dashboardHeader =
            By.xpath("//h6[normalize-space()='Dashboard']");

    public boolean isDashboardDisplayed(){
        return driver.findElement(dashboardHeader).isDisplayed();
    }
}
