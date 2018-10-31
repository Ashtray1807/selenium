package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WorkingAndUderConstructionLinks {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        String URL = "http://demo.guru99.com/test/newtours/";
        String underConsTitle = "Under Construction: Mercury Tours";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Navigate to url
        driver.get(URL);

        //List all webelements starting with letter "a"
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        String[] linkTexts = new String[linkElements.size()];
        int i=0;

        //Extract the link texts of each link element
        for (WebElement e:linkElements){
            linkTexts[i] = e.getText();
            i++;

        }
        //Test each link
        for (String t:linkTexts){
            driver.findElement(By.linkText(t)).click();
            if(driver.getTitle().equals(underConsTitle)){

                System.out.println("\"" + t + "\"" + " is under construction.");
            }
         else
            {
                System.out.println("\"" + t + "\"" + " is working.");

            }




        }

        //Close browser
        driver.quit();


    }
}
