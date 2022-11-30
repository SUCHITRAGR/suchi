package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsdemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SUCHGR\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.office.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("hero-banner-sign-in-to-office-365-link")).click();
        int links=driver.findElements(By.tagName("a")).size();
        System.out.println("links");
    }
}
