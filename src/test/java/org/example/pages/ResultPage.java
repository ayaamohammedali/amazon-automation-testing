package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResultPage {

    public WebElement productLink ()
    {
        return Hooks.driver.findElement(By.xpath("(//h2[contains(@class, 'a-size-mini')]//a[contains(@class, 'a-link-normal')]//span[contains(@class, 'a-text-normal')])[1]"));
    }

    public WebElement searchResultTitle ()
    {
        return Hooks.driver.findElement(By.xpath("//span[@class=\"a-color-state a-text-bold\"]"));
    }


}
