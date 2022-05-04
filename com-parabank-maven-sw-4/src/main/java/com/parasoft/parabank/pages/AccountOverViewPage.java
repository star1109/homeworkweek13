package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class AccountOverViewPage extends Utility {
    By accoutOverviewText = By.xpath("//h1[@class = 'title']");
    By logOutLink = By.linkText("Log Out");

    public String getAccountOverviewText()
    {
        return  getTextFromElement(accoutOverviewText);
    }

    public void clickOnLogoutLink()
    {
        clickOnElement(logOutLink);
    }
}
