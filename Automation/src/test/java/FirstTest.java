
import com.dice.base.BaseTest;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {


    @Test
    public void firstTestMethod() {
        //Open Dice.com
        driver.get("https://www.dice.com");
        System.out.println("Dice Opened. Test passed!");

    }


}

