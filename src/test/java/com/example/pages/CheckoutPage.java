package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void fillDetails(String firstName, String lastName, String postalCode) {
        waitForElementToBeVisible(By.cssSelector("[data-test=\"firstName\"]")).sendKeys(firstName);
        waitForElementToBeVisible(By.cssSelector("[data-test=\"lastName\"]")).sendKeys(lastName);
        waitForElementToBeVisible(By.cssSelector("[data-test=\"postalCode\"]")).sendKeys(postalCode);
        waitForElementToBeClickable(By.cssSelector("[data-test=\"continue\"]")).click();
    }
}