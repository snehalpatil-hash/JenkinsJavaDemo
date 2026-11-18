package com.fb;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FbloginUser {

    public static void main(String[] args) {

        // Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open website
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Username
        WebElement username = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.name("username"))
        );
        username.sendKeys("Admin");

        // Password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        // Login button
        WebElement loginBtn = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))
        );
        loginBtn.click();

        // Verify login (Dashboard)
        wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']"))
        );

        System.out.println("Login Successful ✅");

        // Close browser
        driver.quit();
    }
}