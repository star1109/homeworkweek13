package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ChrckOutHomePage extends Utility
{
    public String getTextofWelcomePleaseSignIn()
    {
        return getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
    }

    public void clickOnCheckOutAsaGuest(){
        clickOnElement(By.xpath("//button[text()='Checkout as Guest']"));

    }

    public void clickOnRegisterButton()
    {
        clickOnElement(By.xpath("//a[@class ='ico-register']"));
    }



}
