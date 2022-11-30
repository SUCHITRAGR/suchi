package seleniumdemo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class Selenium3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SUCHGR\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        Actions mouse=new Actions(driver);
        mouse.sendKeys(Keys.PAGE_DOWN).build().perform();
        driver.findElement(By.xpath("//div[@class=\"card mt-4 top-card\"][1]")).click();
        driver.findElement(By.xpath("//li[@id=\"item-0\"][1]")).click();
        driver.findElement(By.id("userName")).sendKeys("suchitra");
        driver.findElement(By.id("userEmail")).sendKeys("suchitragr123@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("SUCHOTRA D/O RAMACHNADRAPPA GOWDIHALLI");
        driver.findElement(By.id("permanentAddress")).sendKeys("SUCHITA RAMACHNDRAPPA GOWDIHALLI HOLALKERE CHITRADURGA");
        driver.findElement(By.id("submit")).click();

    }
}
