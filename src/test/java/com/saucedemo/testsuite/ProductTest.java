package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testbase.BaseTest;
import com.saucedemo.utilities.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

    LoginPage loginPage= new LoginPage();
    ProductPage productPage = new ProductPage();
@Test
    public void verifyThatSixProductsAreDisplayedOnPage() {

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        String expectedPages= "6";
        Assert.assertEquals(productPage.getProductsPerPage(),expectedPages);

    }

}
