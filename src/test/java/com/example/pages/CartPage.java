package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void checkout() {
        waitForElementToBeClickable(By.cssSelector("[data-test=\"checkout\"]")).click();
    }
}