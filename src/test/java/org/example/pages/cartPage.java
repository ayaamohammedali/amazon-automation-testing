package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class cartPage {
    public WebElement cartBtn ()
    {
        return Hooks.driver.findElement(By.id("nav-cart"));
    }
    public WebElement cartProductTitle()
    {
        return Hooks.driver.findElement(By.xpath(("(//span[contains(@class, 'a-truncate-cut')])[1]")));
    }
}
