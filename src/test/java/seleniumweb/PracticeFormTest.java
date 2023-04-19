package seleniumweb;

import com.digital.ui.driver.driver;
import com.digital.ui.pages.PracticeForm;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class PracticeFormTest {
    @Test
    public void fillformtest(){
        PracticeForm practiceForm=new PracticeForm();
        File file =new File("./logo.png");
        practiceForm.openPage();
        practiceForm.inputFirstName("Samat")
                .inputLastName("Elikbaev")
                .inputemail("sss@gmail.com")
                .inputRadio("Other")
                .inputUserNumber("1234567890")
                .inputDate("2 May 1999")
                .inputSubject("mat","che")
                .inputCheckBox("Music", "Reading")
                .inputSelectFile("C:\\Users\\user\\IdeaProjects\\Winter2022TAF\\src\\test\\java\\seleniumweb\\11.png")
                .inputAddress("Bishkek123")
                .inputState()
                .pressSubmit()
        ;



    }
}
