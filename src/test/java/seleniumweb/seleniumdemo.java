package seleniumweb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

public class seleniumdemo {
    //public static void main(String[] args) throws InterruptedException {
    @Test
    public void demo() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.google.com/");
        WebElement searchInputField = driver.findElement(By.name("q"));
        searchInputField.sendKeys("iphone");
        Thread.sleep(2000);
        searchInputField.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        WebElement appleText = driver.findElement(By.tagName("h3"));
        String expectedAppleInputText = "iPhone – Apple (RU)";
        Assert.assertEquals(appleText.getText(), expectedAppleInputText);
        String sessionId = ((RemoteWebDriver) driver).getSessionId().toString();
        System.out.println(sessionId);
    }

    @Test
    public void demo2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://demoqa.com/text-box");
        WebElement fullname = driver.findElement(By.id("userName"));
        fullname.sendKeys("Samat");
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("citizenkg@gmail.com");
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("bishkek");
        WebElement permamnentAddress = driver.findElement(By.id("permanentAddress"));
        permamnentAddress.sendKeys("same bishkek");
        WebElement clickable = driver.findElement(By.className("btn btn-primary"));

        //clickable.click();
        driver.close();


    }

    @Test
    public void demo3() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        WebElement we = driver.findElement(By.className("main-header"));

    }

    @Test
    public void demo4() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/links");
        //WebElement we=driver.findElement(By.className("main-header"));
        WebElement we = driver.findElement(By.linkText("Home"));
        System.out.println(we.getText());
        WebElement we1= driver.findElement(By.partialLinkText("Bad"));
        System.out.println(we1.getText());
    }
}