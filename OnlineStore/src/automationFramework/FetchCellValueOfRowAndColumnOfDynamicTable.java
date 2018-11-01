package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FetchCellValueOfRowAndColumnOfDynamicTable {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String URL = "http://money.rediff.com/gainers/bsc/daily/groupa?";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Navigate to page
        driver.get(URL);

        //Find the table
        WebElement baseTable = driver.findElement(By.tagName("table"));

        //Find third row of table
        WebElement tableRow = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
        String rowText = tableRow.getText();
        System.out.println("Third row of table: " + rowText);

        //Get the 2nd column in the 3rd row
        WebElement cellINeed = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
        String valueINeed = cellINeed.getText();
        System.out.println("Cell value is: " + valueINeed);
        Thread.sleep(3000);

        //Close bowser
        driver.quit();
















    }
}
