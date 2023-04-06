import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.Test;

public class calculatorTest {
    //@Test
//    public void addtwonumbersTest(){
//    Assert.assertEquals(calculator.add(2,3),5);
//    Assert.assertEquals(calculator.add(3,3),6);
//    //System.out.println(calculator.add(2, 3));
//}
    @Test(dataProvider = "sq")
    public void square(int [][] m,int n){
        Assert.assertEquals(calculator.squarePatch(n),m);
    }
    @DataProvider
    public static Object[][]sq(){
        return new Object[][]{
                {new int[][] {{3, 3, 3},{3, 3, 3},{3, 3, 3}},3},
                {new int[][] {{2, 2},  {2, 2} },2},
                {new int[][] {{4, 4, 4, 4},{4, 4, 4, 4},{4, 4, 4, 4},{4, 4, 4, 4}},4 },
                {new int[][] {{6, 6, 6, 6, 6, 6},{6, 6, 6, 6, 6, 6},{6, 6, 6, 6, 6, 6},{6, 6, 6, 6, 6, 6},{6, 6, 6, 6, 6, 6},{6, 6, 6, 6, 6, 6}},6},
                {new int[][] {{5, 5, 5, 5, 5},{5, 5, 5, 5, 5},{5, 5, 5, 5, 5},{5, 5, 5, 5, 5},{5, 5, 5, 5, 5}},5},
                {new int[][]{{1}},1},
                {new int[][]{},0}
        };
    }
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
    @Test(dataProvider="evenodd")
    public void evenodd(int[] a, int b){
        Assert.assertEquals(calculator.warOfNumbers(a),b);
    }
    @DataProvider
    public static Object[][]evenodd(){
        return new Object[][]{
                {new int[]{5,9,45,6,2,7,34,8,6,90,5,243},168},
                {new int[]{654,7,23,3,78,4,56,34},793},
                {new int[]{1,2,3,4,5,6,7,8,9},5},
                {new int[]{97,83,209,141,134,298,110,207,229,275,115,64,244,278},228},
                {new int[]{332,92,35,315,109,168,320,230,63,323,16,204,105,17,226,157,245,44,223,136,93},83},
                {new int[]{322,89,36,310,297,157,251,55,264,244,200,304,25,308,311,269,303,257,6,311,307,310,50,46,54,237,59,105,267},846},
                {new int[]{50,100,149,1,200,199,3,2},0}
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
