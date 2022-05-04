package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By userName = By.id("txtUsername");
    By password = By.id("txtPassword");
    By loginButton =By.id("btnLogin");
    By forgetPasswordLink = By.linkText("Forgot your password?");

    public void enterUserName(String name)
    {
        sendTextToElement(userName,name);
    }

    public void enterPassword(String pwd)
    {
        sendTextToElement(password,pwd);
    }

    public void clickOnLoginButton()
    {
        clickOnElement(loginButton);
    }

    public void clickOnForgetPasswordLink()
    {
        clickOnElement(forgetPasswordLink);
    }
}
