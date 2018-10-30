package automationFramework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands_3 {

    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of the FireFox driver
        WebDriver driver = new ChromeDriver();

        //Set the driver to maximize the window it will open
        driver.manage().window().maximize();

        //Set the driver to navigate to the desired web page
        driver.get("http://demoqa.com/frames-and-windows/");

        //Click on elemnt
        driver.findElement(By.xpath(".//*[@class='btn btn-primary']")).click();

        //Close Browser
        Thread.sleep(5000);
        driver.close();
    }
}
