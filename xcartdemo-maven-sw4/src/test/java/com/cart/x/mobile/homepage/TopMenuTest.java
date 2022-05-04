package com.cart.x.mobile.homepage;

import com.cart.x.mobile.pages.*;
import com.cart.x.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    ShippingPage shippingPage = new ShippingPage();
    NewLinkPage newLinkPage = new NewLinkPage();
    ComingSoonPage comingSoonPage = new ComingSoonPage();
    ContactUsPage contactUsPage = new ContactUsPage();

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() {
        homePage.clickOnShippingLink();
        Assert.assertEquals(shippingPage.getShippingText(), "Shipping", "error");

    }

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() {
        homePage.clickOnNewLink();
        Assert.assertEquals(newLinkPage.getNewArrivalesText(), "New arrivals", "error");

    }

    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully() {
        homePage.clickOnComingSoon();
        Assert.assertEquals(comingSoonPage.getComingSoonText(), "Coming soon", "error");
    }

    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() {
        homePage.clickOnContactUs();
        Assert.assertEquals(contactUsPage.getContactUsText(),"Contact us","error");

    }
}
