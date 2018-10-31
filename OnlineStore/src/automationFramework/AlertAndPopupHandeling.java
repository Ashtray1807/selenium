package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AlertAndPopupHandeling {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String URL = "http://demo.guru99.com/test/delete_customer.php";
        driver.manage().window().maximize();

        //Navigate to page
        driver.get(URL);

        //Input data and submit
        driver.findElement(By.cssSelector("input[name^='cusid']")).sendKeys("53920");
        driver.findElement(By.cssSelector("input[name^='submit']")).submit();

        //Switching to alert
        Alert alert = driver.switchTo().alert();

        //Capture alert message
        String alertMessage = driver.switchTo().alert().getText();

        //Display alert message
        System.out.println(alertMessage);
        Thread.sleep(5000);

        //Accept allert
        alert.accept();











    }
}
