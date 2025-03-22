package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get("https://www.saucedemo.com/");
    }

    public void login(String username, String password) {
        waitForElementToBeVisible(By.id("user-name")).sendKeys(username);
        waitForElementToBeVisible(By.id("password")).sendKeys(password);
        waitForElementToBeClickable(By.id("login-button")).click();
    }
}