package com.cart.x.mobile.pages;

import com.cart.x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class NewLinkPage extends Utility {

    public String getNewArrivalesText()
    {
            return getTextFromElement(By.id("page-title"));
    }
}
