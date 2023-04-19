package seleniumweb;

import com.digital.ui.driver.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

public class Waitsdemo {
    WebDriver Driver = driver.getDriver();
    @Test
    public void explicitWaitDemo() throws InterruptedException {
        Driver.get("https://demoqa.com/dynamic-properties");
        WebDriverWait wait=new WebDriverWait(driver.getDriver(),Duration.ofSeconds(7));
        Boolean txt=wait.until(ExpectedConditions.attributeToBe(By.id("colorChange"),"class","mt-4 text-danger btn btn-primary"));
        Thread.sleep(4000);
    }

    }
