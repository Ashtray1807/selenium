package com.dice.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    protected void methodSetUp() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    protected void methodTearDown() {
        driver.quit();
    }


}
