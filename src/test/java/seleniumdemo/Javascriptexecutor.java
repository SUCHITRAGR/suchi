package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SUCHGR\\Downloads\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    WebElement ELE= driver.findElement(By.xpath("//button[text()=\"Get values\"]"));
    Javascriptexecutor js = (Javascriptexecutor) driver;
    js.

    }
}
