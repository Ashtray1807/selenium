package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands_5 {
    public static void main(String[] args) throws InterruptedException {
        //Create a new driver
        WebDriver driver = new ChromeDriver();

        //Set the driver to maximize the window it will open
        driver.manage().window().maximize();

        //Set the driver to navigate to the desired web page
        driver.navigate().to("http://toolsqa.wpengine.com/automation-practice-form/");

        //Type a name in the FirstName textbox
        driver.findElement(By.name("firstname")).sendKeys("Ash");
        System.out.println("FirstName a fost introdus");
        Thread.sleep(2000);

        //Type a name in the LastName textbox
        driver.findElement(By.name("lastname")).sendKeys("Tray");
        System.out.println("Last name a fost introdus");
        Thread.sleep(2000);

        //Submit the form
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);

        //Close browser
        driver.quit();
    }
}
