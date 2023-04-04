import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class calculatorTest {
    //@Test
//    public void addtwonumbersTest(){
//    Assert.assertEquals(calculator.add(2,3),5);
//    Assert.assertEquals(calculator.add(3,3),6);
//    //System.out.println(calculator.add(2, 3));
//}
    @Test(dataProvider = "quad")
    public void quadratic(int a, int b, int c, int num){Assert.assertEquals(calculator.solutions(a,b,c),num);}
    @DataProvider
    public static Object[][]quad(){
        return new Object[][]{
                {1, 0, -1,2},
                {1, 0, 0,1},
                {1, 0, 1,0},
                {200, 420, 800,0},
                {200, 420, -800,2},
                {1000, 1000, 0,2},
                {10000, 400, 4,1}
        };
    }

    @Test
    public void sumdoubletest() {
        Assert.assertEquals(SomeClass.sumDouble(1,2),3);
    }

    @Test(dataProvider = "numbers")
    public void arrayofmultiples(int a,int b, int[] c){
        Assert.assertEquals(calculator.arrayOfMultiples(a,b),c);
    }
    @DataProvider
    public static Object[][]numbers(){
        int[] s1={7, 14, 21, 28, 35};
        int[] s2={ 12, 24, 36, 48, 60, 72, 84, 96, 108, 120 };
        int[] s3={ 17, 34, 51, 68, 85, 102, 119 };
        int[] s4={ 630, 1260, 1890, 2520, 3150, 3780, 4410, 5040, 5670, 6300, 6930, 7560, 8190, 8820 };
        int[] s5={ 140, 280, 420 };
        int[] s6={ 7, 14, 21, 28, 35, 42, 49, 56 };
        int[] s7={ 11, 22, 33, 44, 55, 66, 77, 88, 99, 110, 121, 132, 143, 154, 165, 176, 187, 198, 209, 220, 231 };
        return new Object[][]{
                {7,5,s1},
                {12,10,s2},
                {17,7,s3},
                {630,14,s4},
                {140,3,s5},
                {7,8,s6},
                {11,21,s7}

        };
}
}
