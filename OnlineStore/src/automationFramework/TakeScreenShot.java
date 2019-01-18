package automationFramework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;



public class TakeScreenShot {
    public static void main(String[] args) throws InterruptedException {
        //Create a new driver
        WebDriver driver = new ChromeDriver();
        String appUrl = "http://accounts.google.com";

        //Set the driver to maximize the window it will open
        driver.manage().window().maximize();

        //Navigate to URL
        driver.get(appUrl);

        //Take screenshot
        try {
            File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            //Save screenshot
            FileHandler.copy(screenShot, new File("D:/selenium/screenshot.png"));
        }catch (IOException e){
            e.printStackTrace();
        }


    }

}

