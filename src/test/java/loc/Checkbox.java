package loc;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Checkbox {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUCHGR\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/checkbox");
        driver.findElement(By.cssSelector("svg[class=\"rct-icon rct-icon-uncheck\"]")).click();
        TakesScreenshot tk = (TakesScreenshot) driver;
        File DS= tk.getScreenshotAs(OutputType.FILE);
        File DV = new File(".//SUCHITRA.screenshot.png");
        FileUtils.copyFile(DS,DV);


     }
}