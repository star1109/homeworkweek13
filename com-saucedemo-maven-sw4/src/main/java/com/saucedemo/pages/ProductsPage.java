package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends Utility {
    By productText = By.xpath("//span[@class = 'title']");


    public String getProductText() {
        return getTextFromElement(productText);
    }

    public int getVerifyProducts() {
        List<WebElement> item = driver.findElements(By.className("inventory_item"));
        int actualresult = item.size();
        return actualresult;

    }


}
