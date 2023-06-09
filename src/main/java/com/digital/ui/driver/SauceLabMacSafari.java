package com.digital.ui.driver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class SauceLabMacSafari {
    public static RemoteWebDriver loadSauseLabSafariDriver() throws MalformedURLException {
        SafariOptions browserOptions = new SafariOptions();
        browserOptions.setPlatformName("macOS 13");
        browserOptions.setBrowserVersion("16");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "<your build id>");
        sauceOptions.put("name", "<your test name>");
        browserOptions.setCapability("sauce:options", sauceOptions);

        URL url = new URL("https://oauth-citizenkg-ac986:a0a03435-803e-4e59-8910-7f7e56cd6883@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
        return new RemoteWebDriver(url, browserOptions);
    }

}
