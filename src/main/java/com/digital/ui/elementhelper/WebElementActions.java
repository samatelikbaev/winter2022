package com.digital.ui.elementhelper;

import com.digital.ui.driver.driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebElementActions {
    public WebElementActions input(WebElement element, String txt){
        //waitElementToBeDispayed(element);
        element.sendKeys(txt);
        return this;
    }
    public WebElementActions fileupload(WebElement element,String txt){
        element.sendKeys(txt);
        return this;
    }
    public WebElementActions press(WebElement element){
        //waitElementToBeClickable(element);
        element.click();
        return this;
    }
    public WebElementActions waitElementToBeDispayed(WebElement element){
        new WebDriverWait(driver.getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }
    public WebElementActions waitElementToBeClickable(WebElement element){
        new WebDriverWait(driver.getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }
    public WebElementActions pressDownAndEnter(WebElement element){
        element.sendKeys(Keys.DOWN,Keys.ENTER);
        return this;
    }
}
