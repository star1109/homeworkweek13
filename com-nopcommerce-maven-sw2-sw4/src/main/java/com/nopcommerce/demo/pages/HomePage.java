package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By loginLink = By.linkText("Log in");
    By computerLink = By.linkText("Computers");
    By electronicsLink = By.linkText("Electronics");
    By apparelLink = By.linkText("Apparel");
    By digitalDownloadLink = By.linkText("Digital downloads");
    By booksLink = By.linkText("Books");
    By jewelryLink = By.linkText("Jewelry");
    By giftCardsLink = By.linkText("Gift Cards");
    By registerLink = By.linkText("Register");



    public void clickOnLoginLink()
    {
        clickOnElement(loginLink);
    }

    public void clickOnComputerLink()
    {
        clickOnElement(computerLink);
    }

    public void clickOnElectronicsLink()
    {
        clickOnElement(electronicsLink);
    }

    public void clickOnApparelLink()
    {
        clickOnElement(apparelLink);
    }

    public void clickOnDigitalDownloadLink()
    {
        clickOnElement(digitalDownloadLink);
    }

    public void clickOnBooksLink()
    {
        clickOnElement(booksLink);
    }

    public void clickOnJewelryLink()
    {
        clickOnElement(jewelryLink);
    }

    public void clickOnGigtCardLink()
    {
        clickOnElement(giftCardsLink);
    }

    public void clickOnRegisterLink()
    {
        clickOnElement(registerLink);
    }



}
