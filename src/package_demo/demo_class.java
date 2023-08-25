package package_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demo_class {
    public static void main(String[] args) {

        System.setProperty("webdriver.driver.chrome","C:\\Users\\Karuna\\IdeaProjects\\selenium\\drive\\chromedriver_win32\\chromedriver");
        ChromeOptions op = new ChromeOptions();
        op.addArguments("--remote-allow-origin=*");
        op.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(op);
        driver.get("https://newportal.gomobi.io/login");
        WebElement user=driver.findElement(By.xpath("//input[@placeholder=\"Enter UserName\"]"));
        //driver.findElement(By.xpath("//input[@placeholder=\"Enter UserName\"]"));
        user.sendKeys("dhinesh");
        WebElement pass=driver.findElement(By.xpath("//input[@placeholder=\"*********\"]"));
        pass.sendKeys("abc123");
        WebElement login=driver.findElement(By.xpath("//button[contains(text(),\"Login\")]"));
        login.click();
    }
}
