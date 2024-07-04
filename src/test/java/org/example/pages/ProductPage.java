package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPage {

    public WebElement addToCartBtn()
    {
        return Hooks.driver.findElement(By.id("add-to-cart-button"));
    }

    public WebElement productTitle()
    {
        return Hooks.driver.findElement(By.id("productTitle"));
    }
}
