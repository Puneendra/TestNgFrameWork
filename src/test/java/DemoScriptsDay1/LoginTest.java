package DemoScriptsDay1;

import org.testng.annotations.*;

public class LoginTest
{

//    @BeforeSuite
//    public void  beforeSuite()
//    {
//        System.out.println("Working on Before Suite");
//    }
//
//    @BeforeTest
//    public void   beforeTest()
//    {
//        System.out.println("Working on Before Test");
//    }
//    @BeforeClass
//    public void  beforeClass()
//    {
//        System.out.println("Working on Before Class");
//    }
//    @BeforeMethod
//    public void   beforeMethod()
//    {
//        System.out.println("Working on BeforeMethod");
//    }
    @Test(priority=1)
    public void ValidCredentialsTest()
    {
        System.out.println(" ValidCredentialsTest");
    }
    @Test(groups={"Regression","p1"})
    public void InValidCredentialsTest()
    {
        System.out.println(" InValidCredentialsTest");
    }
    @Test(priority=2,groups={"smoke","p2"})
    public void ValidLoginTest()
    {
        System.out.println(" ValidLoginTest");
    }
}
