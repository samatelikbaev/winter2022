package com.digital.ui.driver;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public interface Waits {
    Integer implicitWait=20;
    default Timeout setUpImplpicit(WebDriver driver){
        return (Timeout) driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
    }
}
