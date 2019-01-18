package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;


public class Tooltip {
    public static void main(String[] args) {
        //Create a new driver
        WebDriver driver = new ChromeDriver();
        String appUrl = "http://demo.guru99.com/test/social-icon.html";
        String expectedTooltip = "Github";

        //Set the driver to maximize the window it will open
        driver.manage().window().maximize();

        //Navigate to URL
        driver.get(appUrl);

        //Find the Github icon at the top right of the header
        WebElement github = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));

        //Get the value of the "title" attribute of the github icon
        String actualTooltip = github.getAttribute("title");

        //Assert the tooltip's value is as expected
        System.out.println("Actual Title of Tool Tip: " + actualTooltip);

        if (actualTooltip.equals(expectedTooltip)){
            System.out.println("Test case passed");


        // Close browser
        driver.quit();
        }
    }

}
