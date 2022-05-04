package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class Homepage extends Utility {
    By userName = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");

    public void enterUserName(String name) {
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
}
