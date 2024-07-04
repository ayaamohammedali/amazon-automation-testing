package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TodayDealsPage {

    public WebElement  PageTitle()
    {
        return Hooks.driver.findElement(By.xpath("//h1[@class=\"a-size-extra-large a-spacing-micro\"]"));
    }

    public WebElement headphonesCheckBox()
    {
        return Hooks.driver.findElement(By.xpath("//span[contains(@class, 'CheckboxFilter-module') and normalize-space(text())=\"Headphones & Earbuds\"]"));
    }

    public WebElement groceryCheckBox()
    {
        return Hooks.driver.findElement(By.xpath("//span[contains(@class, 'CheckboxFilter-module') and normalize-space(text())=\"Grocery & Gourmet Food\"]"));
    }

    public WebElement discountButton()
    {
        return Hooks.driver.findElement(By.xpath("//a[@data-csa-c-element-id='filter-discount-10-']//span[normalize-space(text())=\"10% off or more\"]"));
    }

    public WebElement fourthPageBtn()
    {
        return Hooks.driver.findElement(By.xpath("//li[@class='a-normal' and contains(@aria-label, 'Page 4')]//a[normalize-space(text())='4']"));
    }

    public WebElement selectedPage()
    {
        return Hooks.driver.findElement(By.xpath("//li[@class=\"a-selected\"]//a"));
    }

    public WebElement  dealsProductTitle()
    {
        return Hooks.driver.findElement(By.xpath("(//a[contains(@class, 'a-link-normal DealLink-module__dealLink')])[1]"));
    }
}
