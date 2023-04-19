package seleniumweb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public abstract class basetestdemo {
    public WebDriver driver;
    public basetestdemo open(String url){
        driver.get(url);
        return this;
    }
    public basetestdemo sendKeys(WebElement element, String txt){
       element.sendKeys(txt);
       return this;
    }
    public basetestdemo click(WebElement element){
        element.click();
        return this;
    }
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @AfterClass
    public void tearDown(){
        //driver.close();
        //driver.quit();

    }
}
