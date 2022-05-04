package com.cart.x.mobile.pages;

import com.cart.x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    public void clickOnShippingLink()
    {
        clickOnElement(By.linkText("Shipping"));
    }

    public void clickOnNewLink()
    {
        clickOnElement(By.linkText("New!"));
    }

    public void clickOnComingSoon(){
        clickOnElement(By.linkText("Coming soon"));
    }

    public void clickOnContactUs()
    {
        clickOnElement(By.linkText("Contact us"));
    }


    public void mouseHoverOnHotDealsLink()
    {
        mouseHoverToElement(By.xpath("//div[@class='collapse navbar-collapse']/ul/li[2]/span"));
    }

    public void mouseHoverOnSaleLinkAndClick()
    {
        mouseHoverToElementAndClick(By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[1]/a"));
    }

    public void mouseHoverandClickOnBestSeller()
    {
       clickOnElement(By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[2]/a/span"));
    }

}
