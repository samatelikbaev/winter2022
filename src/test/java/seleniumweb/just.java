package seleniumweb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class just {
    @Test
    public void demo(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://demoqa.com/buttons");
        WebElement element=driver.findElement(By.xpath("//button[@id=\"doubleClickBtn\"]"));
        Actions act = new Actions(driver);
        act.doubleClick(element);
        WebElement element1=driver.findElement(By.xpath("//button[@id=\"rightClickBtn\"]"));
        act.contextClick(element1).perform();
        List<WebElement> allButt = driver.findElements(By.tagName("button"));
        WebElement ele =driver.findElement(By.xpath("//button[text()='Click Me']"));
        act.click(ele).perform();


//        for (WebElement w : allButt)
//        {
//            if (w.getText().matches("Click Me"))
//            {
//                w.click();
//                break;
//            }
//        }
        //WebElement element2=driver.findElement(By.xpath("//button[@id=\"365Fm\"]"));

        //element2.click();
        //act.click(element2);

    }
    @Test
    public void dem() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        File file =new File("./logo.png");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement we =driver.findElement(By.xpath("//input[@type='file']"));
        Thread.sleep(2000);
        we.sendKeys("C:\\Users\\user\\IdeaProjects\\Winter2022TAF\\src\\test\\java\\seleniumweb\\11.png");

        System.out.println(file.getAbsolutePath());
        WebElement subject=driver.findElement(By.xpath("//*[@id=\"subjectsInput\"]"));
        subject.sendKeys("math");
        subject.sendKeys(Keys.ENTER);
    }
    @Test
    public void qq() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://demoqa.com/automation-practice-form");
//        driver.findElement(By.id("state")).click();
//        driver.get("https://demoqa.com/automation-practice-form");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("react-select-3-input")))).sendKeys("NCR",Keys.ENTER);
//        driver.findElement(By.xpath("//body/div/div/div/div/div/div/form/div[10]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
//        WebElement dropdown =driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]"));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("react-select-4-input")))).sendKeys("Delhi",Keys.ENTER);
//        Select select=new Select(dropdown);
//        select.selectByIndex(1);


    }
    @FindBy(xpath = "//input[@type='text'][@id='dateOfBirthInput']")public WebElement Datebirthday;
    @Test
    public void tt() {
        String txt = "May";
        String txty = "1999";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/automation-practice-form");
        String month = "may", year = "1999", day = "2";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
        WebElement we = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text'][@id='dateOfBirthInput']")));
        we.click();
        Select selectMonth = new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")));
        if (txt.equals("May")) {
            selectMonth.selectByValue("4");
        }
        Select selectYear = new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")));
        selectYear.selectByValue(txty);
        WebElement dayb=driver.findElement(By.xpath("//div [@class='react-datepicker__day react-datepicker__day--00\"arr[0]\" react-datepicker__day--weekend']"));
        //WebElement dayb=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[1]"));
        dayb.click();
    }
}
