package com.cart.x.mobile.pages;

import com.cart.x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SecureCheckoutPage extends Utility
{
    public String getSecureCheckOutText()
    {
        return getTextFromElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/h1"));
    }

    public void enterFirstName(String fname)
    {
        sendTextToElement(By.id("shippingaddress-firstname"), fname);

    }
    public void enterLastName(String lname)
    {
        sendTextToElement(By.id("shippingaddress-lastname"), lname);

    }

    public void enterAddress(String add)
    {
        sendTextToElement(By.id("shippingaddress-street"), add);

    }

    public void enterState(String state) throws InterruptedException {
        sendTextToElement(By.id("shippingaddress-custom-state"), state);

    }

    public void clickOnLocalShipping()
    {
        clickOnElement(By.id("method128"));

    }

    public void clickOnPAymentMethodCOD()
    {
        clickOnElement(By.id("pmethod6"));
    }

    public void clickOnPlaceOrder()
    {
        clickOnElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]"));

    }

}
