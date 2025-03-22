package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmationPage extends BasePage {

    public ConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public void verifyOrderCompletion() {
        WebElement completeHeader = waitForElementToBeVisible(By.cssSelector("[data-test=\"complete-header\"]"));
        if (!completeHeader.getText().contains("Thank you for your order!")) {
            throw new AssertionError("Order completion message not found!");
        }
    }
}