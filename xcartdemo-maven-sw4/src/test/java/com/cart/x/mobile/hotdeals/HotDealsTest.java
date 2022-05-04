package com.cart.x.mobile.hotdeals;

import com.cart.x.mobile.pages.BestsellersPage;
import com.cart.x.mobile.pages.HomePage;
import com.cart.x.mobile.pages.SalePage;
import com.cart.x.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotDealsTest extends TestBase {

    HomePage homePage  = new HomePage();
    SalePage salePage = new SalePage();
    BestsellersPage bestsellersPage = new BestsellersPage();


    @Test
    public void verifySaleProductsArrangeAlphabetically() {
        homePage.mouseHoverOnHotDealsLink();
        homePage.mouseHoverOnSaleLinkAndClick();
        String expectedMessage = "Sale";
        String actualMessage = salePage.getSaleText();
        Assert.assertEquals(expectedMessage, actualMessage, "Sale page not displayed");
        salePage.mouseHoveronSortBy();
        salePage.mouseHoverAndClickOnNameAtoZ();
    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() {
        homePage.mouseHoverOnHotDealsLink();
        homePage.mouseHoverOnSaleLinkAndClick();
        String expectedMessage = "Sale";
        String actualMessage = salePage.getSaleText();
        Assert.assertEquals(expectedMessage, actualMessage, "Sale page not displayed");
        salePage.mouseHoveronSortBy();
        salePage.mouseHoverAndClickOnPriceLowToHigh();

            }

    @Test
    public void verifySaleProductsArrangeByRates() throws InterruptedException {
        homePage.mouseHoverOnHotDealsLink();
        homePage.mouseHoverOnSaleLinkAndClick();
        String expectedMessage = "Sale";
        String actualMessage = salePage.getSaleText();
        Assert.assertEquals(expectedMessage, actualMessage, "Sale page not displayed");
        salePage.mouseHoveronSortBy();
      //  Thread.sleep(2000);
       // salePage.mouseHoverAndClickRates();

    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() {
        homePage.mouseHoverOnHotDealsLink();
        homePage.mouseHoverandClickOnBestSeller();
        String expectedMessage = "Bestsellers";
        String actualMessage = bestsellersPage.getBestsellersText();
        Assert.assertEquals(expectedMessage, actualMessage, "Bestsellers page not displayed");
        bestsellersPage.hoverOnDropBox();
        bestsellersPage.hoverAndClickOnZToA();


    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() {
        homePage.mouseHoverOnHotDealsLink();
        homePage.mouseHoverandClickOnBestSeller();
        String expectedMessage = "Bestsellers";
        String actualMessage = bestsellersPage.getBestsellersText();
        Assert.assertEquals(expectedMessage, actualMessage, "Bestsellers page not displayed");
        bestsellersPage.hoverOnDropBox();
        bestsellersPage.hoverAndClickOnHighToLow();
        String expectedMessage1 = "Price High - Low";
        String actualMessage1 = bestsellersPage.getHighToLowText();
        Assert.assertEquals(expectedMessage1, actualMessage1, "Error has occurred --->  Test failed :");
    }

    @Test
    public void verifyBestSellersProductsArrangeByRates() {
        homePage.mouseHoverOnHotDealsLink();
        homePage.mouseHoverandClickOnBestSeller();
        String expectedMessage = "Bestsellers";
        String actualMessage = bestsellersPage.getBestsellersText();
        Assert.assertEquals(expectedMessage, actualMessage, "Bestsellers page not displayed");
        bestsellersPage.hoverOnDropBox();
        bestsellersPage.hoverAndClickOnArrangedByRates();
        String expectedMessage1 = "Rates";
        String actualMessage1 = bestsellersPage.getArrangedByRatesText();
        Assert.assertEquals(expectedMessage1, actualMessage1, "Error has occurred --->  Test failed :");
    }
}
