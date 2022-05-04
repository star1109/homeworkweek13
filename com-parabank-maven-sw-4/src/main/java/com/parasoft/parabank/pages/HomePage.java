package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By registerLink = By.linkText("Register");
    By username = By.name("username");
    By password = By.name("password");
    By loginbutton = By.xpath("//input[@class = 'button']");
    By loginErrorMessage = By.xpath("//div[@id = 'rightPanel']/p");
    By customerLoginText = By.xpath("//div[@id = 'leftPanel']/h2");

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void enterUserName(String name)
    {
        sendTextToElement(username,name);
    }

    public void enterPassword(String pwd)
    {
        sendTextToElement(password,pwd);
    }

    public void clickOnLoginButton()
    {
        clickOnElement(loginbutton);
    }

    public String getLoginErrorText()
    {
        return getTextFromElement(loginErrorMessage);
    }

    public String getCustomerLoginText()
    {
        return getTextFromElement(customerLoginText);
    }


}
