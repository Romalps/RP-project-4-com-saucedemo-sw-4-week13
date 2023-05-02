package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends Utility {

    By productText = By.xpath("//span[@class='title']");

    public String getProductText() {
        return getTextFromElement(productText);
    }

    public String getProductsPerPage() {
        List<WebElement> totalItems = driver.findElements(By.xpath("//div[@class='inventory_item_label']"));
        int size = totalItems.size();
        return String.valueOf(size);
    }
}
