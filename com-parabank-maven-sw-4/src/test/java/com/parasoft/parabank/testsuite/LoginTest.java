package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.pages.AccountOverViewPage;
import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    AccountOverViewPage accountOverViewPage = new AccountOverViewPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        homePage.enterUserName("star11");
        homePage.enterPassword("1234567");
        homePage.clickOnLoginButton();

        String expectedResult = "Accounts Overview";
        String actualResult = accountOverViewPage.getAccountOverviewText();
        Assert.assertEquals(actualResult,expectedResult,"error");

    }

    @Test
    public void verifyTheErrorMessage()
    {
        homePage.enterUserName("star1100");
        homePage.enterPassword("12345678");
        homePage.clickOnLoginButton();

        String expectedResult = "The username and password could not be verified.";
        String actualResult = homePage.getLoginErrorText();
        Assert.assertEquals(actualResult,expectedResult,"error");
    }

    @Test
    public void userShouldLogOutSuccessfully()
    {
        homePage.enterUserName("star11");
        homePage.enterPassword("1234567");
        homePage.clickOnLoginButton();
        accountOverViewPage.clickOnLogoutLink();

        String expectedResult = "Customer Login";
        String actualText = homePage.getCustomerLoginText();
        Assert.assertEquals(actualText,expectedResult,"error page not found");

    }
}
