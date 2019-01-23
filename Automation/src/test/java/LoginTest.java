import com.dice.base.BaseTest;
import com.dice.pages.LoginPage;
import com.dice.pages.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void positiveLoginTest(){
        LoginPage loginPage = new LoginPage(driver);
        String expectedPageTitle = "Seeker Dashboard - Profile";
        String correctProfileName = "a a";


        //Open Dice login page
        loginPage.openLoginPage();

        //Fill email and password
        loginPage.fillUpEmailAndPassword("ion@mailinator.com", "123qwe!@#QWE");

        //Click sign in and wait for profile page to load
        ProfilePage profilePage = loginPage.pushSignInButton();
        profilePage.waitForProfilePageToLoad();

        //Verifications
        //-Verify title of the page is Seeker Dashboard - Profile
        System.out.println("Verification");
        String actualTitle = profilePage.getTitle();
        Assert.assertTrue(expectedPageTitle.equals(actualTitle),
                "Page title is not expected.\nExpected: " + expectedPageTitle + "\nActual: " + actualTitle);
        //-Verify correct name on profile page
        Assert.assertTrue(profilePage.isCorrectProfileLoaded(correctProfileName), "Profile name is not expected");


    }


}
