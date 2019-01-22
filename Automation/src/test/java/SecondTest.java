import com.dice.base.BaseTest;
import org.testng.annotations.Test;

public class SecondTest extends BaseTest {

    @Test
    public void secondTestMethod() {
        //Open LinkedIn.com
        driver.get("https://www.linkedin.com");
        System.out.println("LinkedIn Opened. Test passed!");

    }
}
