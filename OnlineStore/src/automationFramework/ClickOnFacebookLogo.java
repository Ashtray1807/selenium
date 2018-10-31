package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnFacebookLogo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String URL = "https://www.facebook.com/login/identify?ctx=recover";

        //Navigate to page
        driver.get(URL);

        //Click on Facebook logo
        driver.findElement(By.cssSelector("i[class^='fb_logo img sp_7W6Es4xLVtl sx_d94a7f']")).click();
        String title = driver.getTitle();
        System.out.println(title);

        //Verify that we are now back on Facebook's homepage
        if (driver.getTitle().equals(title)){
            System.out.println("We are back at Facebook's homepage");
            }
            else
        {
            System.out.println("We are NOT in Facebook's homepage");
        }

        //Close browser
        driver.quit();






    }
}
