package TestNgBasics;

import org.testng.annotations.*;

public class TestNgfirstClass {
	


@AfterTest
public void AfterTest()
{
	System.out.println("AfterTest");
}

@BeforeClass
public void BeforeClass()
{
	System.out.println("BeforeClass");
}

@AfterClass
public void AfterClass()
{
	System.out.println("AfterClass");
}

@BeforeMethod
public void BeforeMethod()
{
	System.out.println("BeforeMethod");
}

@AfterMethod
public void AfterMethod()
{
	System.out.println("@AfterMethod");
}

@Test(priority=1,dependsOnMethods="Testcase1")
public void Testcase2()
{
	System.out.println("Testcase2");
}

@Test(priority=0,timeOut=1)
public void Testcase1() throws InterruptedException
{
	System.out.println("Testcase1");
	Thread.sleep(50000);
	//throw new ArithmeticException("Exception raised");
}

}
