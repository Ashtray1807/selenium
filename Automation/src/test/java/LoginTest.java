import com.dice.base.BaseTest;
import com.dice.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void positiveLoginTest(){
        LoginPage loginPage = new LoginPage(driver);


        //Open Dice login page
        loginPage.openLoginPage();

        //Fill email and password

        //Click sign in and wait for profile page to load

        //Verifications

        //-Verify title of the page is Seeker Dashboard-Profile

        //-Verify correct name on profile page



    }


}
