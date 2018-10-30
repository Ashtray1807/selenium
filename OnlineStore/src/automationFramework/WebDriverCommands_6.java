package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands_6 {
    public static void main(String[] args) throws InterruptedException {
        //Create a new driver
        WebDriver driver = new ChromeDriver();

        //Set the driver to maximize the window it will open
        driver.manage().window().maximize();

        //Set the driver to navigate to the desired web page
        driver.navigate().to("http://toolsqa.wpengine.com/automation-practice-form/");

        // Click on "Partial Link Text" link
        driver.findElement(By.partialLinkText("Partial")).click();
        System.out.println("Partial link test passed");

        // Convert element in to a string
        String sClass = driver.findElement(By.tagName("button")).toString();

        // Click on "Link Text" link
        driver.findElement(By.linkText("Link Test")).click();
        System.out.println("Link test pass");

        //Close browser
        Thread.sleep(2000);
        driver.quit();
    }



}
