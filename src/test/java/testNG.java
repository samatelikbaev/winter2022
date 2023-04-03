import org.testng.Assert;
import org.testng.annotations.Test;

public class testNG {
@Test
public void createnewuser(){
    lombok user1=new lombok("John", 30);
    Assert.assertNotNull(user1);
}
@Test(dependsOnMethods = "createnewuser")
public void logintest(){
    Assert.assertTrue(true);
}
}
