import org.testng.Assert;
import org.testng.annotations.Test;

public class calculatorTest {
    //@Test
//    public void addtwonumbersTest(){
//    Assert.assertEquals(calculator.add(2,3),5);
//    Assert.assertEquals(calculator.add(3,3),6);
//    //System.out.println(calculator.add(2, 3));
//}
    @Test
    public void countEvens() {
        int[] s = {2, 1, 2, 3, 4};

        Assert.assertEquals(SomeClass.countEvens(s),3);

    }

    @Test
    public void sumdoubletest() {
        Assert.assertEquals(SomeClass.sumDouble(1,2),3);
    }
}
