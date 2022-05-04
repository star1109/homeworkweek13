package com.cart.x.mobile.pages;

import com.cart.x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class CartPage extends Utility {
    public String getYourShopingCartItemText() {
        return getTextFromElement(By.id("page-title"));
    }

    public void clickOnGoToCheckOutButton() {
        clickOnElement(By.xpath("//span[text()='Go to checkout']"));
    }

    public void clickOnEmptyYourCartLink() {
        clickOnElement(By.xpath("//a[contains(text(),'Empty your cart')]"));
    }

    public void acceptTheAlert() {
        acceptAlert();
    }

    public String getItemDeleteFromYourCartText() {
return getTextFromElement(By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]"));
    }

    public String getYourcartIsEmptyText()
    {
        return getTextFromElement(By.xpath("//h1[contains(text(),'Your cart is empty')]"));
    }
}


