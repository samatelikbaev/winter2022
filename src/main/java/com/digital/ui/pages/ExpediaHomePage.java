package com.digital.ui.pages;

import com.digital.ui.driver.driver;
import com.digital.ui.elementhelper.WebElementActions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpediaHomePage {
    private WebElementActions elementActions= new WebElementActions();
    public  ExpediaHomePage(){
        PageFactory.initElements(driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@text()]='Stays'")
    public WebElement stays;
    @FindBy(xpath = "//span[@text()]='Flights'")
    public WebElement flights;
    @FindBy(xpath = "//span[@text()]='Cars'")
    public WebElement cars;
    @FindBy(xpath = "//span[@text()]='Packages'")
    public WebElement packages;
    @FindBy (xpath = "//button[@aria-label='Going to']")
    public WebElement goingToBtn;
    @FindBy (id="location-field-destination")
    public WebElement locationDstinationInputFiled;
    @FindBy(xpath = "//button[@data-testid='submit-button']")
    public WebElement searchBtn;

    public ExpediaHomePage goToPages(){
        driver.getDriver().get("https://www.expedia.com/");
        return this;
    }
    public ExpediaHomePage searchByDestination(String destination) throws InterruptedException {
        goingToBtn.click();
        locationDstinationInputFiled.sendKeys(destination);
        Thread.sleep(5000);
        //elementActions.press(goingToBtn)

          //      .input(locationDstinationInputFiled,destination);
                locationDstinationInputFiled.sendKeys(Keys.DOWN);
        Thread.sleep(1000);
                locationDstinationInputFiled.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
                elementActions.press(searchBtn);
                //searchBtn.click();

        return this;
    }
}
