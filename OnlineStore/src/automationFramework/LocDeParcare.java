package automationFramework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class LocDeParcare {
    public static void main(String[] args) throws InterruptedException {

        //Create a new driver
        WebDriver driver = new ChromeDriver();

        //Set the driver to maximize the window it will open
        driver.manage().window().maximize();

        //Set the driver to navigate to the desired web page
        driver.get("http://aplicatie.mobilitateurbana4.ro");

        //Click on the address bar
        driver.findElement(By.xpath("//*[@class=\"select2-selection__placeholder\"]")).click();

        //Input address
        driver.findElement(By.xpath("//*[@class=\"select2-search__field\"]")).sendKeys("trestiana 13");

        //Wait for page to load
        Thread.sleep(3000);

        //Click on the highlighted option
        driver.findElement(By.cssSelector(".select2-results__option--highlighted")).click();

        //Wait for page to load
        Thread.sleep(3000);

        //Check for Nu sunt locuri de parcare message
        if (driver.getPageSource().contains("Loc de parcare indisponibil"));
        System.out.println("NU sunt locuri");

        //Close browser
        Thread.sleep(3000);
        driver.quit();
    }
}
