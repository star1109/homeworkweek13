package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.pages.RegistrationPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        homePage.clickOnRegisterLink();
        String expectedResult = "Register";
        String actualResult = registerPage.getRegisterText();
        Assert.assertEquals(expectedResult, actualResult, "Register page not found");
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        homePage.clickOnRegisterLink();
        registerPage.selectFemaleRadioButton();
        registerPage.enterFisrtName("prime");
        registerPage.enterLastName("testing");
        registerPage.selectDateOfBirth("11");
        registerPage.selectMonthOfBirth("September");
        registerPage.selectYearOfBirth("1998");
        registerPage.enterEmail("prime@gmail.com");
        registerPage.enterPassword("123456789");
        registerPage.enterConfirmPassword("123456789");
        registerPage.clickonRegisterButton();

        String expectedResult = "Your registration completed";
        String actualResult = registrationPage.getRegistrationCompleteText();
        Assert.assertEquals(expectedResult,actualResult,"Registration Unsucessfull");

    }


}
