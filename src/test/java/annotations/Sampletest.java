package annotations;

import org.testng.annotations.*;

public class Sampletest {
    @Test(groups = "group1")
    public void demotest(){
        System.out.println("demo test");
    }
    @BeforeMethod
    public void Demobefore(){
        System.out.println("demo before method");
    }
    @AfterMethod
    public void Demoafter(){
        System.out.println("demo after method");
    }
    @BeforeClass
    public void Demobeforeclass(){
        System.out.println("demo before class");
    }
    @AfterClass
    public void Demoafterclass(){
        System.out.println("demo after class");
    }
    @BeforeTest
    public void Demobeforetest(){ System.out.println("demo before test");    }
    @AfterTest
    public void Demoaftertest(){
        System.out.println("demo after test");
    }
    @BeforeSuite
    public void DemobeforeSuite(){
        System.out.println("demo before suite");
    }
    @AfterSuite
    public void DemoafterSuite(){
        System.out.println("demo after suite");
    }
    @BeforeGroups(groups = "group1")
    public void demoBeforeGroups(){
        System.out.println("demo before group");
    }
    //priority, depends
}
