package com.nopcommerce.demo.homepage;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase
{
    HomePage homePage = new HomePage();

    @Test
    public void openFromTopMenu() {
        homePage.selectMenu("Books");

    }
}
