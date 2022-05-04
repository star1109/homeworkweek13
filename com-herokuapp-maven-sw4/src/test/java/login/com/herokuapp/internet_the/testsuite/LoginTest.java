package login.com.herokuapp.internet_the.testsuite;

import login.com.herokuapp.internet_the.pages.Homepage;
import login.com.herokuapp.internet_the.pages.SecureAreaPage;
import login.com.herokuapp.internet_the.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    Homepage homepage = new Homepage();
    SecureAreaPage secureAreaPage = new SecureAreaPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials()
    {
        homepage.enterUserName("tomsmith");
        homepage.enterPassword("SuperSecretPassword!");
        homepage.clickOnLoginButton();

        String expectedResult = "Secure Area";
        String actualResult = secureAreaPage.getSecureAreaText();
        System.out.println(actualResult + expectedResult);

    }
    @Test
    public void verifyTheUsernameErrorMessage()
    {
        homepage.enterUserName("tomsmith1");
        homepage.enterPassword("SuperSecretPassword!");
        homepage.clickOnLoginButton();

        String expectedResult = "Your username is invalid!";
        String actualResult = homepage.getInvalidUserNameMessage();
        Assert.assertEquals(expectedResult,actualResult,"error");
    }

    @Test
    public void verifyThePasswordErrorMessage()
    {
        homepage.enterUserName("tomsmith");
        homepage.enterPassword("SuperSecretPassword");
        homepage.clickOnLoginButton();

        String expectedResult = "Your password is invalid!";
        String actualResult = homepage.getInvalidPasswordMessage();
        Assert.assertEquals(expectedResult,actualResult,"error");
    }

}
