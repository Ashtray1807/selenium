package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverCommands_10 {
    public static void main(String[] args) throws InterruptedException {

        //Create a new driver
        WebDriver driver = new ChromeDriver();

        //Set the driver to maximize the window it will open
        driver.manage().window().maximize();

        // Put an Implicit wait,
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Launch the URL
        driver.get("http://toolsqa.wpengine.com/automation-practice-table/");

        //Here we are storing the value from the cell into the string variable
        String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
        System.out.println(sCellValue);

        //Here we are clicking on the link of first row and the last column
        driver.findElement(By.xpath(".//*[@id='content']/table[1]/tbody[1]/tr[1]/td[6]/a[1]")).click();

        //Close browser
        Thread.sleep(3000);
        //driver.quit();

    }
}