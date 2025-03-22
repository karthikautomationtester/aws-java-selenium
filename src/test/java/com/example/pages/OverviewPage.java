package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage extends BasePage {

    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    public void finish() {
        waitForElementToBeClickable(By.cssSelector("[data-test=\"finish\"]")).click();
    }
}