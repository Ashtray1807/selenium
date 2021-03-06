package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GmailLogin {
    public static void main(String[] args) throws InterruptedException {
        //Create a new driver
        WebDriver driver = new ChromeDriver();
        String appUrl = "http://accounts.google.com";

        //Set the driver to maximize the window it will open
        driver.manage().window().maximize();

        //Navigate to URL
        driver.get(appUrl);

        //Expected title page
        String expectedTitle = "Conectați-vă – Conturi Google";

        //Actual title page
        String actualTitle = driver.getTitle();

        //Compare titles
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Verification Successful - The correct title is displayed on the web page.");
        }
        else
        {
            System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
        }
        //Insert username
        WebElement username = driver.findElement(By.id("identifierId"));
        username.clear();
        username.sendKeys("TestSelenium");
        WebElement clickInainteUser = driver.findElement(By.xpath("//*[contains(@class, 'RveJvd snByac')]"));
        clickInainteUser.click();
        Thread.sleep(3000);




        //Insert password
        WebElement password = driver.findElement(By.xpath("//*[contains(@class, 'whsOnd zHQkBf')]"));
        password.clear();
        password.sendKeys("password123");
        WebElement clickInaintePassword = driver.findElement(By.xpath("//*[contains(@class, 'RveJvd snByac')]"));
        clickInaintePassword.click();



        }

    }

