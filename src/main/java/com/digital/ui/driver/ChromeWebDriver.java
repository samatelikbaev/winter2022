package com.digital.ui.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class ChromeWebDriver implements Waits{
    public static WebDriver loadChromeDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--no-sandbox");
        WebDriver driver =new ChromeDriver(options);

        //Waits.implicitWait(driver);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }
}
