package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.By;


import java.util.HashMap;


public class DownloadFile2 {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
        String downloadFilePath = "D:\\selenium";

        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadFilePath);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        options.addArguments("--test-type");
        options.addArguments("--disable-extensions");
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);


        WebDriver driver = new ChromeDriver(options);
        driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
        driver.findElement(By.linkText("smilechart.xls")).click();
    }









}