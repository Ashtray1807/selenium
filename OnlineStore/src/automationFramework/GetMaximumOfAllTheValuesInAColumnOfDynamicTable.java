package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.text.NumberFormat;

public class GetMaximumOfAllTheValuesInAColumnOfDynamicTable {
    public static void main(String[] args) throws InterruptedException, ParseException {

        WebDriver driver = new ChromeDriver();
        String URL = "http://money.rediff.com/gainers/bsc/daily/groupa?";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        double m=0, r=0;

        //Navigate to page
        driver.get(URL);

        //Get the number of columns
        List col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
        System.out.println("Number of columns are: " + col.size());

        //Get the number of rows
        List row = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println("The number of rows is: " + row.size());

        for (int i=1; i<row.size(); i++ )
        {
            String max = driver.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[\" + (i+1)+ \"]/td[4]")).getText();
            NumberFormat f = NumberFormat.getNumberInstance();
            Number num = f.parse(max);
            max = num.toString();
            m = Double.parseDouble(max);
            if (m>r)
            {
                r=m;
            }




        }
        System.out.println("Maximum current price is : "+ r);







        //Close browser
        Thread.sleep(10000);
        driver.quit();

















    }
}
