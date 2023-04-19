import com.digital.ui.driver.DriverActions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseUiTest implements DriverActions {

    @BeforeClass
    public void setUp(){}
    @AfterClass
    public void tearDown(){

    }
}
