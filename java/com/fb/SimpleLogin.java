package com.fb;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SimpleLogin {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Username/Phone number");
        String un = sc.next();
        System.out.println("Please Enter Password");
        String pw = sc.next();

        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys(un);
        driver.findElement(By.name("pass")).sendKeys(pw);
        driver.findElement(By.name("login")).click();
        sc.close();
    }
}