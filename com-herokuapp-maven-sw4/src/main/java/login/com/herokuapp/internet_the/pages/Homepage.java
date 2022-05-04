package login.com.herokuapp.internet_the.pages;

import login.com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homepage extends Utility {

    By UserName =By.id("username");
    By password =By.id("password");
    By loginButton =By.xpath("//button[@type='submit']");
    By userNameError =By.xpath("//div[contains(text(),'Your username is invalid!')]");
    By passwordError = By.xpath("//div[contains(text(),'Your password is invalid!')]");

    public void enterUserName(String name)
    {
        sendTextToElement(UserName,name);
    }

    public void enterPassword(String pwd)
    {
        sendTextToElement(password,pwd);
    }

    public void clickOnLoginButton()
    {
        clickOnElement(loginButton);
    }

    public String getInvalidUserNameMessage()
    {
        String expectedResult = "Your username is invalid!";
        WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Your username is invalid!')]"));
        String actualResult = element.getText();
        String mainResult = actualResult.substring(0,25);
        return  mainResult;
    }
    public String getInvalidPasswordMessage()
    {
        String expectedResult = "Your password is invalid!";
        WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Your password is invalid!')]"));
        String actualResult = element.getText();
        String mainResult = actualResult.substring(0,25);
        return mainResult;

    }

}
