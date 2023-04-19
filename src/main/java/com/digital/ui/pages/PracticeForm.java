package com.digital.ui.pages;

import com.digital.ui.driver.driver;
import com.digital.ui.elementhelper.WebElementActions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.SecureRandom;
import java.time.Duration;

public class PracticeForm {

    public PracticeForm() {
        PageFactory.initElements(driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@placeholder='First Name']")public WebElement FirstName;
    @FindBy(xpath = "//input[@placeholder='Last Name']")public WebElement LasttName;
    @FindBy(xpath = "//input[@placeholder='name@example.com']")public WebElement email;
    @FindBy(xpath = "//input[@id='userNumber']")public WebElement Usernumber;
    @FindBy(xpath = "//input[@type='text'][@id='dateOfBirthInput']")public WebElement Datebirthday;
    @FindBy(xpath = "//label[normalize-space()=\"Male\"]")public WebElement Male;
    @FindBy(xpath = "//label[normalize-space()=\"Female\"]")public WebElement Female;
    @FindBy(xpath = "//label[normalize-space()=\"Other\"]")public WebElement Other;
    @FindBy(xpath = "//label[normalize-space()=\"Sports\"]")public WebElement Hcheck1;
    @FindBy(xpath = "//label[normalize-space()=\"Reading\"]")public WebElement Hcheck2;
    @FindBy(xpath = "//label[normalize-space()=\"Music\"]")public WebElement Hcheck3;
    @FindBy(xpath = "//input[@type='file']")public WebElement Selectfile;
    @FindBy(xpath = "//textarea[@placeholder='Current Address']") WebElement CurrAddress;
    @FindBy(xpath="//input[@id='react-select-3-input']")WebElement DropDown;
    @FindBy(xpath = "//*[@id=\"subjectsInput\"]") WebElement Subject;
    @FindBy(xpath = "//input[@id='react-select-3-input']") WebElement State;
    @FindBy(xpath = "//button [@id='submit']") WebElement Submit;
    public PracticeForm pressSubmit(){
        Submit.sendKeys(Keys.ENTER);
        return this;
    }
    public PracticeForm inputState(){
        WebDriverWait wait = new WebDriverWait(driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.getDriver().findElement(By.id("react-select-3-input")))).sendKeys("NCR",Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(driver.getDriver().findElement(By.id("react-select-4-input")))).sendKeys("Delhi",Keys.ENTER);
        return this;}
    public PracticeForm inputAddress(String Address){
        WebElementActions we = new WebElementActions();
        we.input(this.CurrAddress, Address);
        return this;
    }
    public PracticeForm inputSubject(String str1){
        WebElement subject=driver.getDriver().findElement(By.xpath("//*[@id=\"subjectsInput\"]"));
        subject.sendKeys(str1);
        subject.sendKeys(Keys.ENTER);
        return this;}
    public PracticeForm inputSubject(String str1,String str2){
        WebElement subject=driver.getDriver().findElement(By.xpath("//*[@id=\"subjectsInput\"]"));
        subject.sendKeys(str1);
        subject.sendKeys(Keys.ENTER);
        subject.sendKeys(str2);
        subject.sendKeys(Keys.ENTER);
        return this;}
    public PracticeForm inputSubject(String str1,String str2, String str3){
        WebElement subject=driver.getDriver().findElement(By.xpath("//*[@id=\"subjectsInput\"]"));
        subject.sendKeys(str1);
        subject.sendKeys(Keys.ENTER);
        subject.sendKeys(str2);
        subject.sendKeys(Keys.ENTER);
        subject.sendKeys(str3);
        subject.sendKeys(Keys.ENTER);
        return this;}
    public PracticeForm inputDrop(){
        Select select=new Select(DropDown);
        select.selectByVisibleText("");
        return this;
    }
    public PracticeForm inputSelectFile(String txt) {
        WebElementActions we = new WebElementActions();
        we.fileupload(Selectfile,txt);
        return this;
    }
    public PracticeForm inputFirstName(String Firstname) {
        WebElementActions we = new WebElementActions();
        we.input(this.FirstName, Firstname);
        return this;
    }
    public PracticeForm inputCheckBox(String hobby1) {
        WebElementActions we = new WebElementActions();
        if(hobby1.equalsIgnoreCase("Sports"))we.press(Hcheck1);
        if(hobby1.equalsIgnoreCase("Reading"))we.press(Hcheck2);
        if(hobby1.equalsIgnoreCase("Music"))we.press(Hcheck3);
        return this;
    }
    public PracticeForm inputCheckBox(String hobby1,String hobby2) {
        WebElementActions we = new WebElementActions();
        if((hobby1.equalsIgnoreCase("Sports")&&(hobby2.equalsIgnoreCase("Reading")))||((hobby2.equalsIgnoreCase("Sports")&&(hobby1.equalsIgnoreCase("Reading"))))){
            we.press(Hcheck1);we.press(Hcheck2);}
        if((hobby1.equalsIgnoreCase("Sports")&&(hobby2.equalsIgnoreCase("Music")))||((hobby2.equalsIgnoreCase("Sports")&&(hobby1.equalsIgnoreCase("Music"))))){
            we.press(Hcheck1);we.press(Hcheck3); }
        if((hobby1.equalsIgnoreCase("Music")&&(hobby2.equalsIgnoreCase("Reading")))||((hobby2.equalsIgnoreCase("Music")&&(hobby1.equalsIgnoreCase("Reading"))))){
            we.press(Hcheck3);we.press(Hcheck2);        }
        return this;
    }
    public PracticeForm inputCheckBox(String hobby1,String hobby2, String hobby3) {
        WebElementActions we = new WebElementActions();
        we.press(Hcheck1);we.press(Hcheck2);we.press(Hcheck3);
        return this;
    }
    public PracticeForm inputLastName(String Lastname) {
        WebElementActions we = new WebElementActions();
        we.input(this.LasttName, Lastname);
        return this;
    }
    public PracticeForm inputemail(String email) {
        WebElementActions we = new WebElementActions();
        we.input(this.email, email);
        return this;
    }
    public PracticeForm openPage(){
        driver.getDriver().get("https://demoqa.com/automation-practice-form");
        return this;
    }
    public PracticeForm inputUserNumber(String Usernumber) {
        WebElementActions we = new WebElementActions();
        we.input(this.Usernumber, Usernumber);
        return this;
    }
    public PracticeForm inputDate(String date) {
        String[] arr =date.split(" ");

        WebDriverWait wait = new WebDriverWait(driver.getDriver(), Duration.ofSeconds(3000));
        WebElement we = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text'][@id='dateOfBirthInput']")));
        we.click();
        Select selectMonth = new Select(driver.getDriver().findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")));
        selectMonth.selectByVisibleText(arr[1]);
        Select selectYear = new Select(driver.getDriver().findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")));
        selectYear.selectByValue(arr[2]);
        WebElement dayb=driver.getDriver().findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[1]"));
        dayb.click();

        return this;
    }
    public PracticeForm inputDate() {
        WebElementActions we = new WebElementActions();
        WebElement ele=new RemoteWebElement();
        ele.clear();
        return this;
    }
    public PracticeForm inputRadio(String gender){
        try {
            if (gender.equals("Male")) Male.click();
            if (gender.equals("Female")) Female.click();
            if (gender.equals("Other")) Other.click();
            else {throw new Exception(); }
        }catch (Exception e){
            System.out.println("enter appropriate gender");;
        }

        return this;
    }
    public PracticeForm choseGender(String gender){
        WebElement el = driver.getDriver().findElement(By.xpath("//input[@value='"+gender+"']"));
        el.click();
        return this;}



}
