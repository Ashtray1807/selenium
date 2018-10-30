package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebDriverCommands_8 {
    public static void main(String[] args) throws InterruptedException {

        //Create a new driver
        WebDriver driver = new ChromeDriver();

        //Set the driver to maximize the window it will open
        driver.manage().window().maximize();

        // Put an Implicit wait,
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Launch the URL
        driver.get("http://toolsqa.wpengine.com/automation-practice-form");

    //Select 'Continents' Drop down ( Use Id to identify the element )
        // Find Select element of "Single selection" using ID locator
        Select oSelect = new Select(driver.findElement(By.id("continents")));

        //Select option 'Europe' (Use selectByVisibleText)
        oSelect.selectByVisibleText("Europe");
        Thread.sleep(2000);

        //Select option 'Africa' (Use selectByIndex
        oSelect.selectByIndex(2);
        Thread.sleep(2000);

    //Print all the options for the selected drop down and select one option of your choice
        //Get the size of the Select element
        List<WebElement> oSize = oSelect.getOptions();
        int iListSize = oSize.size();

        //Setting up the loop to print all the options
        for(int i =0; i < iListSize ; i++){

        //Storing the value of the option
            String sValue = oSelect.getOptions().get(i).getText();

        //Printing the stored value
            System.out.println(sValue);

        // Putting a check on each option and if any of the option is equal to 'Australia' then select it
            if(sValue.equals("Australia")){
                oSelect.selectByIndex(i);
                break;
            }

        }
        //Close Browser
            Thread.sleep(2000);
            driver.quit();




    }
}
