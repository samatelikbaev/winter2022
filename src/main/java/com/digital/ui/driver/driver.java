package com.digital.ui.driver;

import com.digital.config.configReader;
import com.digital.ui.pages.PracticeForm;
import org.openqa.selenium.WebDriver;

public class driver {

    private driver(){
        //Singleton pattern
    }
    private static WebDriver driver;
    public static WebDriver getDriver(){
        if(driver==null){
            switch (configReader.getProperty("browser").toLowerCase()){
                case"chrome":
                    driver=ChromeWebDriver.loadChromeDriver();
                    break;
                case"edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
                    break;

            }
        }
        return driver;


    }
    public static void closeDriver() {
        try {
            if(driver != null) {
                driver.close();
                driver.quit();
                driver = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
