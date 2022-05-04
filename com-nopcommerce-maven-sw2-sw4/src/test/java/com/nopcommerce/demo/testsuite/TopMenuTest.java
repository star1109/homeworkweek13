package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    ApparelPage apparelPage = new ApparelPage();
    DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage();
    BooksPage booksPage = new BooksPage();
    JewelryPage jewelryPage = new JewelryPage();
    GiftCardsPage giftCardsPage = new GiftCardsPage();

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        homePage.clickOnComputerLink();
        String expectedResult = "Computers";
        String actualResult  = computerPage.getComputerText();
        Assert.assertEquals(expectedResult,actualResult,"Computer page not found");
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully()
    {
        homePage.clickOnElectronicsLink();
        String expectedResult = "Electronics";
        String actualResult  = electronicsPage.getElectronicsText();
        Assert.assertEquals(expectedResult,actualResult,"Electronics page not found");
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully()
    {
        homePage.clickOnApparelLink();
        String expectedResult = "Apparel";
        String actualResult  = apparelPage.getApparelText();
        Assert.assertEquals(expectedResult,actualResult,"Apparel page not found");
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully()
    {
        homePage.clickOnDigitalDownloadLink();
        String expectedResult = "Digital downloads";
        String actualResult  = digitalDownloadsPage.getDigitalDownloadText();
        Assert.assertEquals(expectedResult,actualResult,"Digital downloads page not found");
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully()
    {
        homePage.clickOnBooksLink();
        String expectedResult = "Books";
        String actualResult  = booksPage.getBooksText();
        Assert.assertEquals(expectedResult,actualResult,"Books page not found");
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully()
    {
        homePage.clickOnJewelryLink();
        String expectedResult = "Jewelry";
        String actualResult  = jewelryPage.getjewelryText();
        Assert.assertEquals(expectedResult,actualResult,"Jewelry downloads page not found");
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully()
    {
        homePage.clickOnGigtCardLink();
        String expectedResult = "Gift Cards";
        String actualResult  = giftCardsPage.getGiftCardsText();
        Assert.assertEquals(expectedResult,actualResult,"Gift cards page not found");
    }

}
