package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class ForgetPasswordPage extends Utility {

    By forgetPasswordText = By.xpath("//div/div[2]/h1");

    public String getForgetPasswordText()
    {
        return getTextFromElement(forgetPasswordText);

    }
}
