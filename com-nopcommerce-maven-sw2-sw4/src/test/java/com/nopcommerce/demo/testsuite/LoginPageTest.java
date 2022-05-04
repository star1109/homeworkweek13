package com.nopcommerce.demo.testsuite;


import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnLoginLink();
        String expectedResult = "Welcome, Please Sign In!";
        String actualResult = loginPage.getWelcomeText();
        Assert.assertEquals(expectedResult,actualResult,"login page not found");
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials()
    {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("prime@gmail.com");
        loginPage.enterPassword("12345678");
        loginPage.clickOnLoginButton();

        String expectedResult = "Log out";
        String actualResult = loginPage.getLogOutText();
        Assert.assertEquals(expectedResult,actualResult,"user is not logged in");
    }

    @Test
    public void verifyTheErrorMessage()
    {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("abc@gmail.com");
        loginPage.enterPassword("1234");
        loginPage.clickOnLoginButton();

        String expectedResult = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualresult = loginPage.getErrorMessage();
        Assert.assertEquals(expectedResult,actualresult,"Error occured");
    }

}


