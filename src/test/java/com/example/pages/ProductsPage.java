package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {
        waitForElementToBeClickable(By.cssSelector("[data-test=\"add-to-cart-sauce-labs-backpack\"]")).click();
    }

    public void addTwoToCart() {
        addToCart();
        waitForElementToBeClickable(By.cssSelector("[data-test=\"add-to-cart-sauce-labs-bike-light\"]")).click();
    }

    public void goToCart() {
        waitForElementToBeClickable(By.cssSelector("[data-test=\"shopping-cart-link\"]")).click();
    }
}