package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class JewelryPage extends Utility {
    By jewelryText = By.linkText("Jewelry");

    public String getjewelryText()
    {
        return getTextFromElement(jewelryText);
    }
}
