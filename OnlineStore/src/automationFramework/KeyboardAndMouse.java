package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class KeyboardAndMouse {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String URL = "http://demo.guru99.com/test/newtours/";
        driver.manage().window().maximize();

        //Navigat to page
        driver.get(URL);

        //Find the Home link
        WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver.findElement(By.xpath("//html/body/div"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr"));

        //Perform mouseover
        Actions builder = new Actions(driver);
        Action mouseOverHome = builder.moveToElement(link_Home).build();

        //Mouseover visual
        String bgColor = td_Home.getCssValue("BACKGROUND-COLOR");
        System.out.println("Before hover: " + bgColor);
        Thread.sleep(2000);
        mouseOverHome.perform();

        System.out.println("After hover: " + bgColor);





    }






}



