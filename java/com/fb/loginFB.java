
package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginFB {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("89794798");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("89794798");
        driver.findElement(By.name("pass")).sendKeys("akjdhjkaf");
        driver.findElement(By.name("login")).click();

    }
}