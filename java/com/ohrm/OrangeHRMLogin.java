package com.ohrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLogin {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(50));

        // Usernm
        WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.name("username")
                )
        );

        username.sendKeys("Admin");
        

        // Pass
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.name("password")
                )
        );

        password.sendKeys("admin123");

        // Loginbtn
        WebElement loginButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[@type='submit']")
                )
        );

        loginButton.click();

        // Verify dashboard
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//h6[text()='Dashboard']")
                )
        );

        System.out.println("Login successful!");

        driver.quit();
    }
}