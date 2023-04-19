package seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class locators extends basetestdemo{
    @Test
    public void xpathdemo() throws InterruptedException {
        open("https://demoqa.com/text-box");
        Actions act = new Actions(driver);
        WebElement absolutexpath=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"));
        //WebElement absoluteXpath=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"));
        WebElement Fullname=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        WebElement submit=driver.findElement(By.xpath("//button[text()='Submit']"));

                sendKeys(Fullname,"samat")
                .sendKeys(email,"ss@gmail.com")
                .sendKeys(currentAddress, "Wall123")
                .sendKeys(permanentAddress, "Mira123")


                .click(submit);
        Thread.sleep(3000);
        WebElement fullNameResult = driver.findElement(By.xpath("//p[contains(text(),'Name:')]"));
        WebElement emailResult = driver.findElement(By.xpath("//p[contains(text(),'Email:')]"));
        WebElement currentAddressResult= driver.findElement(By.xpath("//p[contains(text(),'Current Address :')]"));
        WebElement permanentAddressResult= driver.findElement(By.xpath("//p[contains(text(),'Permananet Address :')]"));

        assertTrue(fullNameResult.getText().contains("samat"));
        assertTrue(emailResult.getText().contains("ss@gmail.com"));
        assertTrue(currentAddressResult.getText().contains("Wall123"));
        assertTrue(permanentAddressResult.getText().contains("Mira123"));
    }
}
