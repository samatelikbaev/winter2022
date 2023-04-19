package com.digital.ui.driver;

import org.openqa.selenium.WebDriver;

public interface DriverActions {
    WebDriver driver= com.digital.ui.driver.driver.getDriver();
    public default void open(String url){
        driver.navigate().to(url);

    }
}
