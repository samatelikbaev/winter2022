package ui.expedia;

import com.digital.config.configReader;
import com.digital.ui.driver.driver;
import com.digital.ui.elementhelper.WebElementActions;
import com.digital.ui.pages.ExpediaHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.WeakHashMap;

public class searchByDestinationTest {
    private ExpediaHomePage expediaHomePage=new ExpediaHomePage();
    @Test
    public void searchByDestinationCity() throws InterruptedException {
        expediaHomePage.goToPages()
                .searchByDestination(configReader.getProperty("city").toLowerCase());
        Thread.sleep(10000);
        List<WebElement>hotels = driver.getDriver().findElements(By.tagName("h4"));
        for(WebElement e:hotels){
            System.out.println(e.getText());
    }

    }
}
