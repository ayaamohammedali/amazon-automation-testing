package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.example.pages.ProductPage;
import org.example.pages.ResultPage;
import org.example.pages.cartPage;

public class AddingToCartStepDefs {

    HomePage home = new HomePage();
    ResultPage result = new ResultPage();
    ProductPage product= new ProductPage();
    cartPage cart = new cartPage();

    @Given("user search for an item")
    public void testSearchFunction()
    {
        home.searchTxtBox().sendKeys("car accessories");
        home.searchBtn().click();
    }
    @When("user select an item")
    public void testSelectFirstItem()
    {
      result.productLink().click();
    }
    @Then("user add it to cart")
    public void testAddItemToCart()
    {
        cart.cartBtn().click();
    }


}
