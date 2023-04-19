package seleniumweb;

import com.digital.ui.driver.driver;
import com.digital.ui.pages.PracticeForm;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class driverdemo {
    public static void main(String[] args) throws InterruptedException {
        PracticeForm practiceForm=new PracticeForm();
        File file =new File("./logo.png");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement el=driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
        Select select=new Select(el);
        select.selectByIndex(1);
        select.selectByValue("NCR");
        select.selectByVisibleText("Haryana");
        //WebElement el=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
        //el.sendKeys(file.getAbsolutePath());

        Thread.sleep(3000);
    }
}
