package com.cart.x.mobile.pages;

import com.cart.x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class BestsellersPage extends Utility {


    By bestsellersTxt = By.xpath("//h1[@id='page-title']");
    By sortByDropBox = By.xpath("//div[@class='sort-box']");
    By zToAOption = By.linkText("Name Z - A");
    By highToLowOption = By.linkText("Price High - Low");
    By arrangedByRatesOption = By.linkText("Rates");
    By zToAText = By.xpath("//span[contains(text(),'Name Z - A')]");
    By highToLowText = By.xpath("//span[contains(text(),'Price High - Low')]");
    By arrangedByRatesText = By.xpath("//span[contains(text(),'Rates')]");


    public String getBestsellersText() {
        return getTextFromElement(bestsellersTxt);
    }

    public void hoverOnDropBox() {
        mouseHoverToElement(sortByDropBox);
    }

    public void hoverAndClickOnZToA() {
        mouseHoverToElementAndClick(zToAOption);
    }

    public void hoverAndClickOnHighToLow() {
        mouseHoverToElementAndClick(highToLowOption);
    }

    public String getHighToLowText() {
        return getTextFromElement(highToLowText);
    }

    public void hoverAndClickOnArrangedByRates() {
        mouseHoverToElementAndClick(arrangedByRatesOption);
    }

    public String getArrangedByRatesText() {
        return getTextFromElement(arrangedByRatesText);
    }

    public void mouseHoverAndClickOnAToZ() {
        mouseHoverToElementAndClick(By.linkText("Name A - Z"));

    }

    public void mouseHoveronSortBy() {
        mouseHoverToElement(By.xpath("//div[@class='sort-box']"));
    }

    public void mouseHoverAndClickOnVinylIdolzGhostbustersAddToCartButton() throws InterruptedException {
        mouseHoverToElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[8]"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//ul[@class = 'products-grid grid-list']/li[8]/div/div[2]/div[4]/div/button"));
    }

    public String getProductHAsBeenAddedToCartMessage() {
        return getTextFromElement(By.xpath("//li[contains(text(),'Product has been added to your cart')]"));
    }

    public void clickOncrossToCloseTheMessage() {
        clickOnElement(By.xpath("//div[@id='status-messages']/a"));
    }

    public void clickOnYourCart()
    {
        clickOnElement(By.xpath("//div[@title='Your cart']"));
    }

    public void clickOnViewCart()
    {
        clickOnElement(By.linkText("View cart"));
    }


    public String getLoginToYourAccountText()
    {
        return getTextFromElement(By.xpath("//h3[contains(text(),'Log in to your account')]"));
    }

    public void enterEmail(String email)
    {
        sendTextToElement(By.id("email"),email);
    }
    public void clickOnContinue()
    {
        clickOnElement(By.xpath("//span[contains(text(),'Continue')]"));

    }


}
