import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.security.PublicKey;

public class SomeClassTest {
    @Test(dataProvider = "numbers")
    public void sumdoubletest(int a,int b,int result) {
        SoftAssert softAssertion= new SoftAssert();

        Assert.assertEquals(SomeClass.sumDouble(a,b),result);

        softAssertion.assertEquals(SomeClass.sumDouble(1,2),3);

    }
    @Test
    public void countevenstest(){
        SoftAssert softAssertion= new SoftAssert();
         softAssertion.assertEquals(SomeClass.countEvens(new int[]{1,2,3,4,5}),2);

    }
    @DataProvider
    public static Object[][]numbers(){
        return new Object[][]{
                {1,2,3},
                {3,2,5},
                {2,2,8},
                {0,0,0}

        };
    }
}
