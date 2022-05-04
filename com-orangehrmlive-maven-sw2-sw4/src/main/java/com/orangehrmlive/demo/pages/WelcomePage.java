package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WelcomePage extends Utility {
//    String expectedResult = "Welcome";
//    WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Welcome')]"));
//    String actualResult = element.getText();
//    String mainResult = actualResult.substring(0,7);
//
//        Assert.assertEquals("invalid",expectedResult,mainResult);



    public String verifyWelcomeText() {

        String expectedResult = "Welcome";
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Welcome')]"));
        String actualResult = element.getText();
        String mainResult = actualResult.substring(0,7);
        return mainResult;

    }
}
