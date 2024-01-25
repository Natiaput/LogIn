import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LogINn {

        @Test


        public void loginWithCorrectData() throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");

            By

                    emailField = By.name("user-name"),
                    passwordField= By.name("password"),
                    logInButton = new By.ByXPath("//*[@id=\"login-button\"]");

            driver.findElement(emailField).sendKeys("standard_user");
            driver.findElement(passwordField).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();



            Thread.sleep(5000);



            By cartIcon = By.className("https://www.saucedemo.com/inventory.html");
            Assert.assertTrue(driver.findElement(cartIcon).isDisplayed(), "Cart icon not found!");







            driver.quit();
        }





    }

