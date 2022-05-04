package com.cart.x.mobile.pages;

import com.cart.x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ComingSoonPage extends Utility {
    public String getComingSoonText()
    {
        return getTextFromElement(By.id("page-title"));
    }
}
