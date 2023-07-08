package TestNgBasics;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgSecondClass {
	@BeforeSuite
	public void BeforeSutie()
	{
		System.out.println("BeforeSuite");
	}

	@AfterSuite
	public void AfterSutie()
	{
		System.out.println("AfterSuite");
	}

	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest");
	}
	
	@Test
	public void Testcase3inanothercalss() {
		System.out.println("Testcase3inanothercalss");
	}
}
