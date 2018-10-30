package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands_4 {

    public static void main(String[] args) throws InterruptedException {

        //Create a new driver
        WebDriver driver = new ChromeDriver();

        //Set the driver to maximize the window it will open
        driver.manage().window().maximize();

        //Set the driver to navigate to the desired web page
        driver.get("http://demoqa.com");

        //Click on Read More
        driver.findElement(By.xpath(".//*[@class='btn btn-primary']")).click();
        Thread.sleep(3000);

        //Go back to Home page
        driver.navigate().back();
        Thread.sleep(3000);

        //Go forward to Read More
        driver.navigate().forward();
        Thread.sleep(3000);

        //Go back to Home page
        driver.navigate().to("http://demoqa.com");
        Thread.sleep(3000);

        //Refresh the page
        driver.navigate().refresh();
        Thread.sleep(3000);

        //Close Browser
        driver.quit();
    }
}
