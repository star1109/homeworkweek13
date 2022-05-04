package com.cart.x.mobile.shoping;

import com.cart.x.mobile.pages.*;
import com.cart.x.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopingTest extends TestBase {
    HomePage homePage = new HomePage();
    SalePage salePage = new SalePage();
    BestsellersPage bestsellersPage = new BestsellersPage();
    CartPage cartPage = new CartPage();
    SecureCheckoutPage secureCheckoutPage = new SecureCheckoutPage();
    CheckOutSucessPage checkOutSucessPage = new CheckOutSucessPage();

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForVinylIdolzGhostbusters() throws InterruptedException {
        homePage.mouseHoverOnHotDealsLink();
        homePage.mouseHoverandClickOnBestSeller();
        Assert.assertEquals(bestsellersPage.getBestsellersText(), "Bestsellers", "error");
        bestsellersPage.mouseHoveronSortBy();
        bestsellersPage.mouseHoverAndClickOnAToZ();
        bestsellersPage.mouseHoverAndClickOnVinylIdolzGhostbustersAddToCartButton();
        Assert.assertEquals(bestsellersPage.getProductHAsBeenAddedToCartMessage(), "Product has been added to your cart", "error");
        bestsellersPage.clickOncrossToCloseTheMessage();
        bestsellersPage.clickOnYourCart();
        Thread.sleep(2000);
        bestsellersPage.clickOnViewCart();
        Assert.assertEquals(cartPage.getYourShopingCartItemText(), "Your shopping cart - 1 item", "error");
        cartPage.clickOnGoToCheckOutButton();

        Assert.assertEquals(bestsellersPage.getLoginToYourAccountText(), "Log in to your account", "error");
        bestsellersPage.enterEmail("abc@gmail.com");
        bestsellersPage.clickOnContinue();

        Assert.assertEquals(secureCheckoutPage.getSecureCheckOutText(),"Secure Checkout","error");
        secureCheckoutPage.enterFirstName("abc");
        secureCheckoutPage.enterLastName("xyz");
        secureCheckoutPage.enterAddress("abc street");
        secureCheckoutPage.enterState("abc");
        Thread.sleep(200);
        secureCheckoutPage.clickOnLocalShipping();
        Thread.sleep(2000);
        secureCheckoutPage.clickOnPAymentMethodCOD();
        Thread.sleep(2000);
        secureCheckoutPage.clickOnPlaceOrder();
        Assert.assertEquals(checkOutSucessPage.getThankYouForYourOrderText(),"Thank you for your order","error");

    }

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnHotDealsLink();
        homePage.mouseHoverandClickOnBestSeller();
        Assert.assertEquals(bestsellersPage.getBestsellersText(), "Bestsellers", "error");
        bestsellersPage.mouseHoveronSortBy();
        bestsellersPage.mouseHoverAndClickOnAToZ();
        bestsellersPage.mouseHoverAndClickOnVinylIdolzGhostbustersAddToCartButton();
        Assert.assertEquals(bestsellersPage.getProductHAsBeenAddedToCartMessage(), "Product has been added to your cart", "error");
        bestsellersPage.clickOncrossToCloseTheMessage();
        bestsellersPage.clickOnYourCart();
        Thread.sleep(2000);
        bestsellersPage.clickOnViewCart();
        Assert.assertEquals(cartPage.getYourShopingCartItemText(), "Your shopping cart - 1 item", "error");
         cartPage.clickOnEmptyYourCartLink();
         Thread.sleep(1000);
         cartPage.acceptTheAlert();
         Assert.assertEquals(cartPage.getItemDeleteFromYourCartText(),"Item(s) deleted from your cart","error");
        Assert.assertEquals(cartPage.getYourcartIsEmptyText(),"Your cart is empty","error");
        Thread.sleep(2000);
    }
}
