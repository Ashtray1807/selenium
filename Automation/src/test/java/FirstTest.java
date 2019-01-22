import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void firstTestMethod(){
        WebDriver driver = new ChromeDriver();

        //Open Dice.com
        driver.get("https://www.dice.com");
        System.out.println("Dice Opened. Test passed!");

        driver.quit();





    }
}
