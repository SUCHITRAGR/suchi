package loca;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class dropdown {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SUCHGR\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html%22");
        WebElement ELE=driver.findElement(By.xpath("//select[@id=\"BlogArchive1_ArchiveMenu\"]"));
        Select se=new Select(ELE);
        se.selectByIndex(2);
        TakesScreenshot tk = (TakesScreenshot) driver;
       File screenshot = tk.getScreenshotAs(OutputType.FILE);
       File location = new File(".//suchitra.screenshot.png");
        FileUtils.copyFile(screenshot,location);

    }

}
