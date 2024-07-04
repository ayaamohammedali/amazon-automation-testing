package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePage {

    public WebElement searchTxtBox()
    {
        return Hooks.driver.findElement(By.id("twotabsearchtextbox"));
    }

    public WebElement searchBtn()
    {
        return Hooks.driver.findElement(By.id("nav-search-submit-button"));
    }

    public WebElement todayDealsBtn()
    {
        return Hooks.driver.findElement(By.xpath("//a[@href='/gp/goldbox?ref_=nav_cs_gb' and normalize-space(text())=\"Today's Deals\"]"));
    }
}
