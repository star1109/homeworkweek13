package com.saucedemo.testsuite;

import com.saucedemo.pages.Homepage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    Homepage homepage = new Homepage();
    ProductsPage productspage = new ProductsPage();

    @Test
    public void userSholdLoginSuccessfullyWithValid() {
        homepage.enterUserName("standard_user");
        homepage.enterPassword("secret_sauce");
        homepage.clickOnLoginButton();

        String expectedResult = "PRODUCTS";
        String actualResult = productspage.getProductText();
        Assert.assertEquals(actualResult, expectedResult, "error");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        homepage.enterUserName("standard_user");
        homepage.enterPassword("secret_sauce");
        homepage.clickOnLoginButton();

        int expectedResult =6;
        int actualResult = productspage.getVerifyProducts();
      Assert.assertEquals(actualResult,expectedResult,"error");




    }
}
