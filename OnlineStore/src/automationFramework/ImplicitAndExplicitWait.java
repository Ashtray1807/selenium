package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ImplicitAndExplicitWait {
    public static void main(String[] args) throws InterruptedException {

        //Created reference variable for WebDriver
        WebDriver driver;
        String URL = "https://gmail.com";


        //Initializing driver variable using ChromeDriver
        driver = new ChromeDriver();

        //maximized the browser window
        driver.manage().window().maximize();

        //Launching gmail.com on the browser
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //Saving the GUI element reference into a "username" variable of WebElement type
        WebElement username = driver.findElement(By.cssSelector("input[class^='whsOnd zHQkBf']"));

        //Entering username
        username.sendKeys("shruti.shrivastava.inn");
        Thread.sleep(2000);



        //Click Next
        driver.findElement(By.cssSelector("span[class^='RveJvd snByac']")).click();
        Thread.sleep(2000);


        //Entering password
        driver.findElement(By.cssSelector("input[class^='whsOnd zHQkBf']")).sendKeys("123qwe!@#QWE");

        //Click Next
        driver.findElement(By.cssSelector("span[class^='RveJvd snByac']")).click();

        //Explicit wait - to wait for the compose button to be click-able
        WebDriverWait wait = new WebDriverWait(driver, 30);


        //Click on Compose
        driver.findElement(By.cssSelector("div[class^='T-I J-J5-Ji T-I-KE L3']")).click();
        //driver.findElement(By.xpath("//*[contains(@gh, 'cm')]")).click();
        Thread.sleep(2000);

        //Close browser
        //driver.quit();


    }


}








