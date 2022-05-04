package com.cart.x.mobile.pages;

import com.cart.x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SalePage extends Utility {

    public String getSaleText()
    {
        return getTextFromElement(By.id("page-title"));
    }

    public void mouseHoveronSortBy()
    {
        mouseHoverToElement(By.xpath("//div[@class='sort-box']"));
    }

    public void mouseHoverAndClickOnNameAtoZ()
    {
        mouseHoverToElementAndClick(By.linkText("Name A - Z"));
    }


    public void mouseHoverAndClickOnPriceLowToHigh()
    {
        mouseHoverToElementAndClick(By.xpath("//*[@id=\"XLite-Module-CDev-Sale-View-SalePage-sortby-1\"]/li[4]/a"));
    }

    public void mouseHoverAndClickRates()
    {
        mouseHoverToElementAndClick(By.xpath("//*[@id=\"XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1\"]/li[6]/a"));
    }


}
