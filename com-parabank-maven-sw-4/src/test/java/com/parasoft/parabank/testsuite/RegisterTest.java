package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.pages.RegisterPage;
import com.parasoft.parabank.pages.WelcomePage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    WelcomePage welcomePage = new WelcomePage();

    @Test
    public void verifyThatSigningUpPageDisplay() {
        homePage.clickOnRegisterLink();

        String expectedResult = "Signing up is easy!";
        String actualResult = registerPage.getSignngUpEasyText();
        Assert.assertEquals(actualResult,expectedResult,"error occured");
    }

    @Test
    public void userSholdRegisterAccountSuccessfully()
    {
        homePage.clickOnRegisterLink();
        registerPage.enterFirstName("prime");
        registerPage.enterLastName("testing");
        registerPage.enterAddress("abc street");
        registerPage.enterCity("kingston");
        registerPage.enterState("london");
        registerPage.enterZipCode("123456");
        registerPage.enterMobileNumber("1234567896");
        registerPage.enterSSN("1234585");
        registerPage.enterUsername("star110");
        registerPage.enterPassword("1234567");
        registerPage.enterConfirmPassword("1234567");
        registerPage.clickOnRegisterButton();
        String expectedResult = "Your account was created successfully. You are now logged in.";
        String actualResult  = welcomePage.getWelcomeText();
        Assert.assertEquals(actualResult,expectedResult,"error");
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials()
    {

    }
}
