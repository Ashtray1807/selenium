package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

    public static void main(String[] args) throws InterruptedException {
        //Create a new driver
        WebDriver driver = new ChromeDriver();

        //Set the driver to maximize the window it will open
        driver.manage().window().maximize();

        //Storing the Application Url in the String variable
        String url = "http://www.store.demoqa.com";

        //Launch the ToolsQA WebSite
        driver.get(url);

        // Storing Title name in the String variable
        String title = driver.getTitle();

        // Storing Title length in the Int variable
        int titleLenght = driver.getTitle().length();

        // Printing Title & Title length in the Console window
        System.out.println("Title of the page is : " + title);
        System.out.println("Lenght of the title is : "+ titleLenght);

        // Storing URL in String variable
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(url)){
            System.out.println("Verification Successful - The correct Url is opened.");
        }else
            System.out.println("Verification Failed - An incorrect Url is opened.");
            System.out.println("Actual URL is : " + actualUrl);
            System.out.println("Expected URL is : " + url);

        // Storing Page Source in String variable
        String pageSource = driver.getPageSource();

        // Storing Page Source length in Int variable
        int pageSourceLenght = pageSource.length();

        // Printing length of the Page Source on console
        System.out.println("Total lenght of the Page Source is : " +  pageSourceLenght);

        //Closing browser
        Thread.sleep(5000);
        driver.quit();
    }
}
