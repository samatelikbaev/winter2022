package select;

import com.digital.ui.driver.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Selectdemo {
    public static void main(String[] args) {
        driver.getDriver().get("https://demoqa.com/select-menu");
        WebElement selectdrop=driver.getDriver().findElement(By.id("OldSelectMenu"));
        Select select=new Select(selectdrop);
        select.selectByValue("5");
    }
}
