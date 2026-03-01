package com.hrm.automation.tests;

import com.hrm.automation.base.BaseTest;
import com.hrm.automation.pages.DashboardPage;
import com.hrm.automation.pages.LoginPage;
import com.hrm.automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validLogin(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(ConfigReader.get("Username"),ConfigReader.get("Password"));

        DashboardPage dashboardPage =
                new DashboardPage(driver);

        Assert.assertTrue(
                dashboardPage.isDashboardDisplayed(),
                "Dashboard is not displayed - Login Failed"
        );
    }
}