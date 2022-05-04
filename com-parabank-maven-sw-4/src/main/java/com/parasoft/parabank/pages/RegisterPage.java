package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By signUpEasyText = By.xpath("//div[@id='rightPanel']/h1");
    By firstName = By.id("customer.firstName");
    By lastName = By.id("customer.lastName");
    By address = By.xpath("//tr/td[2]/input[@id='customer.address.street']");
    By city = By.id("customer.address.city");
    By state = By.id("customer.address.state");
    By zipCode = By.id("customer.address.zipCode");
    By mobileNumber = By.id("customer.phoneNumber");
    By ssn = By.id("customer.ssn");
    By userName = By.id("customer.username");
    By password = By.id("customer.password");
    By confirmPassword = By.id("repeatedPassword");
    By registerButton = By.xpath("//input[@value='Register']");

    public String getSignngUpEasyText() {
        return getTextFromElement(signUpEasyText);
    }

    public void enterFirstName(String fName)
    {
        sendTextToElement(firstName,fName);
    }

    public void enterLastName(String lName)
    {
            sendTextToElement(lastName,lName);
    }

    public void enterAddress(String add)
    {
        sendTextToElement(address,add);
    }

    public void enterCity(String City)
    {
        sendTextToElement(city,City);
    }


    public void enterState(String State)
    {
        sendTextToElement(state,State);
    }

    public void enterZipCode(String ZipCode)
    {
        sendTextToElement(zipCode,ZipCode);
    }

    public void enterMobileNumber(String mobile)
    {
            sendTextToElement(mobileNumber,mobile);
    }

    public void enterSSN(String ssn1)
    {
        sendTextToElement(ssn,ssn1);

    }

    public void enterUsername(String uName)
    {
        sendTextToElement(userName,uName);
    }

    public void enterPassword(String pwd)
    {
        sendTextToElement(password,pwd);
    }

    public void enterConfirmPassword(String cpwd)
    {
        sendTextToElement(confirmPassword,cpwd);
    }

    public void clickOnRegisterButton()
    {
        clickOnElement(registerButton);
    }
}
