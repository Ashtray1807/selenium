package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebDriverCommands_7 {
    public static void main(String[] args) throws InterruptedException {
    //Create a new driver
        WebDriver driver = new ChromeDriver();

    //Set the driver to maximize the window it will open
        driver.manage().window().maximize();

    //Set a timeout for the window to load
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    //Se the driver to navigate to the desired web page
        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
        Thread.sleep(3000);

    //Select the deselected Radio button (female) for category Sex (Use IsSelected method)
        //Get a list of all sexes and store it
        List<WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));
        //Create a boolean variable
        boolean bValue = false;
        //This statement will return True, in case of first Radio button is selected
        bValue = rdBtn_Sex.get(0).isSelected();
        //This will check that if the bValue is True which means the first radio button is selected, if not, it will be selected
        if (bValue == false) {
        // This will select Second radio button, if the first radio button is selected by default
            rdBtn_Sex.get(1).click();
        }else{
        // If the first radio button is not selected by default, the first will be selected
            rdBtn_Sex.get(0).click();
        }
    //Select the Third radio button for category 'Years of Exp' (Use Id attribute to select Radio button)
        //List the number of elements in the category
        List<WebElement> listOfButtons = driver.findElements(By.name("exp"));
        //Print the names of the elements in the category
        System.out.println("Numarul de casute este " + listOfButtons.size());
        for(WebElement e : listOfButtons){
            System.out.println("Numele casutelor este " + e.getAttribute("value"));
        }
        //Find the 3rd element and click on it
        WebElement rdBtn_Exp = driver.findElement(By.id("exp-2"));
                rdBtn_Exp.click();

    //Check the Check Box 'Automation Tester' for category 'Profession'( Use Value attribute to match the selection)
        //List the number of professions in the category
        List<WebElement> chkBx_Profession = driver.findElements(By.name("profession"));
        //Print their and names
        System.out.println(chkBx_Profession.size());
        for(WebElement e:chkBx_Profession)
        {
            System.out.println(e.getAttribute("value"));
        }

        //Count the number of CheckBoxes
        int iSize = chkBx_Profession.size();
                for (int i=0; i < iSize ; i++ ){
        //Store the count in a variable
         String sValue = chkBx_Profession.get(i).getAttribute("value");
        //Select the Check Box if the value of the Check Box is same what you are looking for
         if (sValue.equalsIgnoreCase("Automation Tester")){
             chkBx_Profession.get(i).click();
             break;
             }

    }
    //Check the Check Box 'Selenium IDE' for category 'Automation Tool' (Use cssSelector)
        //List the number of automation tools
        List<WebElement> aTools = driver.findElements(By.name("tool"));
        System.out.println(aTools.size());
        //Print their names
        for (WebElement l:aTools){
            System.out.println(l.getAttribute("value"));
        }
        //Click on Selenium IDE
        WebElement chkBx_SeleniumWebdriver = driver.findElement(By.cssSelector("input[value='Selenium Webdriver']"));
        chkBx_SeleniumWebdriver.click();

    //Quit Browser
        Thread.sleep(5000);
        driver.quit();
        }


    }






