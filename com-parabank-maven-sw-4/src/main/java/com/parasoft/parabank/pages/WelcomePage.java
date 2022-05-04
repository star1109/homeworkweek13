package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class WelcomePage extends Utility {
    By welcomeText = By.xpath("//div[@id='rightPanel']/p");

    public String getWelcomeText()
    {
        return getTextFromElement(welcomeText);
    }
}
