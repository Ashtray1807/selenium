package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DownloadFile {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String URL = "https://discordapp.com/";
        driver.manage().window().maximize();

        //Navigat to page
        driver.get(URL);

        //Find the download button
        WebElement downloadButton = driver.findElement(By.cssSelector("a[alt^='Download Discord']"));
        String sourceLocation = downloadButton.getAttribute("href");
        String wget_command = "cmd /c \"C:/Program Files (x86)/GnuWin32/bin/wget.exe\" -P D: --no-check-certificate " + sourceLocation;
        System.out.println("Downloading url " + sourceLocation);


        try {
            Process exec = Runtime.getRuntime().exec(wget_command);
            StreamGobbler errorGobbler = new StreamGobbler(exec.getErrorStream(), "ERROR");
            StreamGobbler outputGobbler = new StreamGobbler(exec.getInputStream(), "OUTPUT");

            errorGobbler.start();
            outputGobbler.start();

            int exitVal = exec.waitFor();
            System.out.println("Exit value: " + exitVal);
            System.out.println("Download complete: " + sourceLocation);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        driver.close();
    }

    static class StreamGobbler extends Thread {
        InputStream is;
        String type;

        StreamGobbler(InputStream is, String type) {
            this.is = is;
            this.type = type;
        }

        public void run() {
            try {
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String line = null;
                while ((line = br.readLine()) != null)
                    System.out.println(type + ">" + line);
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}