package Js;

import com.digital.ui.driver.driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;

public class JsDemo {
    public static void main(String[] args) {
        JavascriptExecutor js=(JavascriptExecutor) driver.getDriver();
        js.executeScript("window.location='https://demoqa.com/buttons'");
    }
}
