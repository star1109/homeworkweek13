package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DesktopsPage extends Utility
{
        By selectPriceLowtoHigh = By.id("products-orderby");
    By addToCartButton = By.xpath("//div[@class='products-wrapper']//div/div/div[1]//div[@class='buttons']/button[1]");
        public void selectFromSortByDropDown(String text)
        {
            selectByVisibleTextFromDropDown(selectPriceLowtoHigh,text);
        }

    public void clickOnAddToCartButton()
    {
        clickOnElement(addToCartButton);
    }
}
