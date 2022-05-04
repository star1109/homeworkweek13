package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.WelcomeBackPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    HomePage homePage = new HomePage();
    WelcomeBackPage welcomeBackPage = new WelcomeBackPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully()
    {
        homePage.clickOnSignInLink();
        String expectedResult = "Welcome Back!";
        String actualResult = welcomeBackPage.getWelcomeText();
        Assert.assertEquals(actualResult,expectedResult,"error");
    }
    @Test
    public void verifyTheErrorMessage()
    {
        homePage.clickOnSignInLink();
        welcomeBackPage.enterEmail("prime@gmail.com");
        welcomeBackPage.enterPassword("1324575852");
        welcomeBackPage.clickOnSignIn();

        String expectedresult = "Invalid email or password.";
        String actualResult = welcomeBackPage.getInvalidLoginErroMessage();
        Assert.assertEquals(actualResult,expectedresult,"error");

    }
}
