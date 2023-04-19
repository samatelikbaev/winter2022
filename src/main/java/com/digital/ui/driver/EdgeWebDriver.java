package com.digital.ui.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeWebDriver {
    public static WebDriver loadEdgeDriver(){
        WebDriverManager.edgedriver().setup();
        WebDriver driver =new EdgeDriver();
        return driver;
    }
}
