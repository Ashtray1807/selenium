package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;


public class SelectDate {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String URL = "http://demos.telerik.com/kendo-ui/datetimepicker/index";

        String dateTime = "12/07/2014 2:00 PM";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Navigate to URL
        driver.get(URL);

        //Open calendar
        WebElement selectDate = driver.findElement(By.cssSelector("span[class^='k-icon k-i-calendar']"));
        selectDate.click();

        //Click next on the calendar
        WebElement nextLink = driver.findElement(By.cssSelector("a[class^='k-link k-nav-next']"));

        //Click on month on the calendar
        WebElement midLink = driver.findElement(By.cssSelector("a[class^='k-link k-nav-fast']"));

        //Click on previous on the calendar
        WebElement previousLink = driver.findElement(By.cssSelector("span[class^='k-icon k-i-arrow-60-left']"));

        //Split the date time to get only the date part
        String date_dd_MM_yyyy[] = dateTime.split("")[0].split("/");

        //Get the year difference between current year and year to set in calander
        int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2]) - Calendar.getInstance().get(Calendar.YEAR);

        midLink.click();

        if (yearDiff != 0) {

            //if you have to move next year

            if (yearDiff > 0) {

                for (int i = 0; i < yearDiff; i++) {

                    System.out.println("Year Diff->" + i);

                    nextLink.click();


                }
            }
        }
    }
}
//NOT finished