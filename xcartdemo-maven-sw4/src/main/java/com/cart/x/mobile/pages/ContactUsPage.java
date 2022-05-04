package com.cart.x.mobile.pages;

import com.cart.x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ContactUsPage extends Utility {
        public String getContactUsText()
        {
            return getTextFromElement(By.id("page-title"));
        }
}
