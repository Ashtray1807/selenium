package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebDriverCommands_9 {

    public static void main(String[] args) throws InterruptedException {

        //Create a new driver
        WebDriver driver = new ChromeDriver();

        //Set the driver to maximize the window it will open
        driver.manage().window().maximize();

        // Put an Implicit wait,
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Launch the URL
        driver.get("http://toolsqa.wpengine.com/automation-practice-form");

        //Select 'Selenium Commands' Multiple select box ( Use Name locator to identify the element )
        Select oSelect = new Select(driver.findElement(By.name("selenium_commands")));

        //Select option 'Browser Commands' and then deselect it (Use selectByIndex and deselectByIndex)
        oSelect.selectByIndex(0);
        Thread.sleep(2000);
        oSelect.deselectByIndex(0);
        Thread.sleep(2000);

        //Select option 'Navigation Commands' and then deselect it (Use selectByVisibleText and deselectByVisibleText)
        oSelect.selectByVisibleText("Navigation Commands");
        Thread.sleep(2000);
        oSelect.deselectByVisibleText("Navigation Commands");

        //Print and select all the options for the selected Multiple selection list
        List<WebElement> oSize = oSelect.getOptions();
        int iListSize = oSize.size();

        // Setting up the loop to print all the options
        for (int i=0;i<iListSize;i++){

            // Storing the value of the option
            String sValue = oSelect.getOptions().get(i).getText();

            //Printing the stored value
            System.out.println(sValue);

            // Selecting all the elements one by one
            oSelect.selectByIndex(i);
            Thread.sleep(3000);
        }

        //Close browser
        driver.quit();
    }


}
