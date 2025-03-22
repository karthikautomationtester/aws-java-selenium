package com.example.tests;

    import com.aventstack.chaintest.plugins.ChainTestListener;
    import com.example.pages.*;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.chrome.ChromeOptions;
    import org.testng.annotations.AfterClass;
    import org.testng.annotations.BeforeClass;
    import org.testng.annotations.Listeners;
    import org.testng.annotations.Test;

    import java.io.IOException;
    import java.nio.file.Files;
    import java.nio.file.Path;

@Listeners(ChainTestListener.class)
    public class ECommerceTest {
        private WebDriver driver;
        private LoginPage loginPage;
        private ProductsPage productsPage;
        private CartPage cartPage;
        private CheckoutPage checkoutPage;
        private OverviewPage overviewPage;
        private ConfirmationPage confirmationPage;

        @BeforeClass
        public void setUp() throws IOException {
            // Set up the WebDriver (e.g., ChromeDriver)
            // Set Chrome options
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--no-sandbox");

            options.addArguments("--disable-dev-shm-usage");

            options.addArguments("--headless");
            // Initialize WebDriver
            driver = new ChromeDriver(options);
            ChainTestListener.log("Launching the browser");

            // Initialize the page objects
            loginPage = new LoginPage(driver);
            productsPage = new ProductsPage(driver);
            cartPage = new CartPage(driver);
            checkoutPage = new CheckoutPage(driver);
            overviewPage = new OverviewPage(driver);
            confirmationPage = new ConfirmationPage(driver);
        }

        @Test
        public void testECommerceFlowSingleProduct() {
            // Login
            loginPage.goTo();
            ChainTestListener.log("Navigated to the login page");
            loginPage.login("standard_user", "secret_sauce");
            ChainTestListener.log("Logged in with standard_user");

            // Add products to the cart
            productsPage.addToCart();
            ChainTestListener.log("Added Sauce Labs Backpack to the cart");
            productsPage.goToCart();
            ChainTestListener.log("Navigated to the cart");

            // Proceed to checkout
            cartPage.checkout();
            ChainTestListener.log("Proceeded to checkout");

            // Fill in checkout details
            checkoutPage.fillDetails("John", "Doe", "12345");
            ChainTestListener.log("Filled in checkout details");

            // Finish the order
            overviewPage.finish();
            ChainTestListener.log("Finished the order");

            // Verify order completion
            confirmationPage.verifyOrderCompletion();
            ChainTestListener.log("Verified order completion");
        }

        @Test
        public void testECommerceFlowTwoProducts() {
            // Login
            loginPage.goTo();
            ChainTestListener.log("Navigated to the login page");
            loginPage.login("standard_user", "secret_sauce");
            ChainTestListener.log("Logged in with standard_user");

            // Add products to the cart
            productsPage.addTwoToCart();
            ChainTestListener.log("Added Sauce Labs Backpack and Bike Light to the cart");
            productsPage.goToCart();
            ChainTestListener.log("Navigated to the cart");

            // Proceed to checkout
            cartPage.checkout();
            ChainTestListener.log("Proceeded to checkout");

            // Fill in checkout details
            checkoutPage.fillDetails("John", "Doe", "12345");
            ChainTestListener.log("Filled in checkout details");

            // Finish the order
            overviewPage.finish();
            ChainTestListener.log("Finished the order");

            // Verify order completion
            confirmationPage.verifyOrderCompletion();
            ChainTestListener.log("Verified order completion");
        }

        @AfterClass
        public void tearDown() {
            // Close the browser
            if (driver != null) {
                driver.quit();
            }
        }
    }