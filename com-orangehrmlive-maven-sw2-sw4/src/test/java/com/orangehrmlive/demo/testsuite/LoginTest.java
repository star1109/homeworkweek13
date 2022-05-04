package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.WelcomePage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    WelcomePage welcomePage = new WelcomePage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        homePage.enterUserName("Admin");
        homePage.enterPassword("admin123");
        homePage.clickOnLoginButton();
        String expectedResult = "Welcome";
        String actualResult = welcomePage.verifyWelcomeText();
        Assert.assertEquals(expectedResult, actualResult, "Welcome page not found:error");


    }
}
