package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.ForgetPasswordPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase
{
    HomePage homePage = new HomePage();
   ForgetPasswordPage forgetPasswordPage = new ForgetPasswordPage();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully()
    {
        homePage.clickOnForgetPasswordLink();
        String expectedResult = "Forgot Your Password?";
        String actualResult = forgetPasswordPage.getForgetPasswordText();
        Assert.assertEquals(expectedResult,actualResult,"Forget password page not found:error");

    }
}
