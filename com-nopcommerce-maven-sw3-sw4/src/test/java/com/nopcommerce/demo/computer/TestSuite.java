package com.nopcommerce.demo.computer;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends TestBase {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    GoToCartPage goToCartPage = new GoToCartPage();
    ChrckOutHomePage chrckOutHomePage = new ChrckOutHomePage();
    BillingAddressPage billingAddressPage = new BillingAddressPage();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    PaymentMethodPage paymentMethodPage  = new PaymentMethodPage();
    PaymentInformationPage paymentInformationPage = new PaymentInformationPage();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();
    OrderCompletedPage completedPage = new OrderCompletedPage();
    @Test
    public void priceLowToHigh() {
        homePage.clickOnComputerLink();
        homePage.clickOnDesktopLink();
        desktopsPage.selectFromSortByDropDown("Price: Low to High");

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.clickOnComputerLink();
        homePage.clickOnDesktopLink();
        desktopsPage.selectFromSortByDropDown("Name: A to Z");
        Thread.sleep(2000);
        desktopsPage.clickOnAddToCartButton();
        String expectedResult = "Build your own computer";
        String actualResult = buildYourOwnComputerPage.getBuildYourOwnComputerText();
        Assert.assertEquals(actualResult, expectedResult, "page not found");
        buildYourOwnComputerPage.selectTextFromProcessorDropDown("2.2 GHz Intel Pentium Dual-Core E2200");
        buildYourOwnComputerPage.selectTextFromPRamDropDown("8GB [+$60.00]");
        buildYourOwnComputerPage.clickOnHDD400GBRadioButton();
        buildYourOwnComputerPage.clickOnOSVistaPremiumRadioButton();
        buildYourOwnComputerPage.clickOnTotalCommanderCheckBox();
        Thread.sleep(3000);

        String expectedprice = "$1,475.00";
        String actualprice = buildYourOwnComputerPage.getPriceText();
        Assert.assertEquals(actualprice,expectedprice,"error");
        buildYourOwnComputerPage.clickOnAddToCartButton();
        Thread.sleep(2000);

        String expectedText = "The product has been added to your shopping cart";
        String actualText = buildYourOwnComputerPage.getProductAddedToCartText();
        Assert.assertEquals(actualText,expectedText,"error");

        buildYourOwnComputerPage.clickOnCrossButton();
        buildYourOwnComputerPage.mouseHoverOnShoppingCart();
        buildYourOwnComputerPage.clickOnGoToCart();

        String expected = "Shopping cart";
        String actual = goToCartPage.getShoppingCartText();
        Assert.assertEquals(actual,expected,"error");

        goToCartPage.changeQuantity("2");
        Thread.sleep(2000);

        goToCartPage.clickOnUpdateCart();

        String expectedtotalprice = "$2,950.00";
        String actualtotalprice = goToCartPage.getverifyPriceAfterUpdate();
        Assert.assertEquals(actualtotalprice,expectedtotalprice,"error");

        goToCartPage.clickOnTermsandConditionsCheckBox();;
        goToCartPage.clickOnCheckOutButton();

        String expectedtWelcomeText ="Welcome, Please Sign In!";
        String actualWelcomeText = chrckOutHomePage.getTextofWelcomePleaseSignIn();
        Assert.assertEquals(actualWelcomeText,expectedtWelcomeText,"error");
        chrckOutHomePage.clickOnCheckOutAsaGuest();
        billingAddressPage.firstName("prime");
        billingAddressPage.lastName("testing");
        billingAddressPage.email("testing@gmail.com");
        billingAddressPage.selectCounty("Romania");
        billingAddressPage.city("kingstton");
        billingAddressPage.address("abc street");
        billingAddressPage.zipCode("123456");
        billingAddressPage.phoneNumber("12344621025");
        billingAddressPage.clickOnContinueButton();
        shippingMethodPage.clickOnNextDayAirRadioButton();
        shippingMethodPage.clickOnContinue();
        paymentMethodPage.clickOnCreditCardRadioButton();
        paymentMethodPage.clickOnContinue();
        paymentInformationPage.selectCreditCardTypeFromTheDropdown("Master card");
        paymentInformationPage.enterCardHolderName("prime");
        paymentInformationPage.enterCardNumbre("5232 1478 4876 3353");
        paymentInformationPage.enterCardCode("0000");
        paymentInformationPage.selectExpiryMonth("06");
        paymentInformationPage.selectExpiryYear("2025");
        paymentInformationPage.clickOncontinue();

        String expectedPaymentMethod ="Credit Card";
        String actualPaymetnMethod =  confirmOrderPage.getPaymentMethodtext();
        Assert.assertEquals(actualPaymetnMethod,expectedPaymentMethod,"error");

        String expectedShipingMethod ="Next Day Air";
        String actualShipingMethod =  confirmOrderPage.getShippingText();
        Assert.assertEquals(actualShipingMethod,expectedShipingMethod,"error");

        String expectedPrice ="$2,950.00";
        String actualPrice =  confirmOrderPage.getVerifyTheTotal();
        Assert.assertEquals(actualPrice,expectedPrice,"error");

        confirmOrderPage.clickOnConfirmButton();

        String expectedtext ="Your order has been successfully processed!";
        String actualtext =  completedPage.getyourOrderHasBeenSuceffullyProcessedText();
        Assert.assertEquals(actualtext,expectedtext,"error");

        completedPage.clickOnContinue();

        String expText ="Welcome to our store";
        String actTxt =  homePage.getWelcomeToOurStoreText();
        Assert.assertEquals(actualtext,expectedtext,"error");

    }


}
