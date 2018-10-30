package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckVisibilityOfWebElements {
    public static void main(String[] args) throws InterruptedException {

        //Create a new driver
        WebDriver driver = new ChromeDriver();
        String appUrl = "http://google.com";

        //Set the driver to maximize the window it will open
        driver.manage().window().maximize();

        //Navigate to URL
        driver.get(appUrl);

        //Expected title page
        String expectedTitle = "Google";

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

        //Verify if the “Google Search” button is displayed and print the result
        boolean
        submitbuttonPresence = driver.findElement(By.xpath("//*[contains(@value, 'Căutare Google')]")).isDisplayed();
        System.out.println(submitbuttonPresence);

        //Enter the keyword in the “Google Search” text box by which we would want to make the request
        WebElement searchTextBox = driver.findElement(By.xpath("//*[contains(@id, 'lst-ib')]"));
        searchTextBox.clear();
        searchTextBox.sendKeys("Selenium");
        searchTextBox.sendKeys(Keys.ESCAPE);

        //Verify that the “Search button” is and enabled
        boolean
        searchIconEnabled = driver.findElement(By.xpath("//*[contains(@name, 'btnK')]")).isEnabled();
        if (searchIconEnabled == true) {
            WebElement searchIcon = driver.findElement(By.xpath("//*[contains(@name, 'btnK')]"));
            searchIcon.click();
            System.out.println("Test successful");
            Thread.sleep(3000);
        }
        //Close browser
        driver.quit();
        }




    }


