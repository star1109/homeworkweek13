package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class WelcomeBackPage extends Utility {

    By welcomeBacktext = By.cssSelector("h1.page__heading");
    By emailId = By.id("user[email]");
    By password = By.id("user[password]");
    By signButton = By.cssSelector("input.button.button-primary.g-recaptcha");
    By invalidLoginError = By.xpath("//li[text() ='Invalid email or password.' ]");

    public String getWelcomeText() {
        return getTextFromElement(welcomeBacktext);
    }

    public void enterEmail(String email)
    {
        sendTextToElement(emailId,email);
    }

    public void enterPassword(String pwd)
    {
        sendTextToElement(password,pwd);
    }

    public void clickOnSignIn()
    {
        clickOnElement(signButton);
    }
     public String getInvalidLoginErroMessage()
     {
         return getTextFromElement(invalidLoginError);
     }
}
