package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class LogInincoorect {



        @Test
        public void loginWithIncorrectData() throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");

            By emailField = By.name("user-name");
            By passwordField = By.name("password");
            By logInButton = By.id("login-button");

            driver.findElement(emailField).sendKeys("standarddd_user");
            driver.findElement(passwordField).sendKeys("secret_sauce");
            driver.findElement(logInButton).click();


            Thread.sleep(5000);


            By errorMessage = By.cssSelector("h3[data-test='error']");


            Assert.assertTrue(driver.findElement(errorMessage).isDisplayed());


            driver.quit();
        }
    }
