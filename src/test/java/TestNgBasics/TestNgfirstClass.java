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

@Test
public void Testcase2()
{
	System.out.println("Testcase2");
}

@Test
public void Testcase1()
{
	System.out.println("Testcase1");
}

}
