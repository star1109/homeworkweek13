package com.cart.x.mobile.pages;

import com.cart.x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutSucessPage extends Utility {
    public String getThankYouForYourOrderText()
    {
        return getTextFromElement(By.xpath("//h1[@id='page-title']"));
    }
}
