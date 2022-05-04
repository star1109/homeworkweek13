package com.cart.x.mobile.pages;

import com.cart.x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ShippingPage extends Utility {

    public String getShippingText()
    {
        return getTextFromElement(By.id("page-title"));
    }
}
