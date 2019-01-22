import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void firstTestMethod() {
        WebDriver driver = new ChromeDriver();

        //Open Dice.com
        driver.get("https://www.dice.com");
        System.out.println("Dice Opened. Test passed!");

        driver.quit();
    }
    @Test
    public void secondTestMethod(){
        WebDriver driver = new ChromeDriver();

        //Open LinkedIn.com
        driver.get("https://www.linkedin.com");
        System.out.println("LinkedIn Opened. Test passed!");

        driver.quit();



    }
}
